package com.zzd.filter;

import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import com.alibaba.cloud.nacos.ribbon.ExtendBalancer;
import com.alibaba.cloud.nacos.ribbon.NacosServer;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.DynamicServerListLoadBalancer;
import com.netflix.loadbalancer.Server;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.server.ServerWebExchange;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 灰度发布-基于权重负载均衡
 * @author 张振栋
 */
@Slf4j
@Component
public class CustomizeBalanceRule extends AbstractLoadBalancerRule {

    //灰度发布标识key
    private static final String GRAYSCALE_KEY = "server-version";

    @Autowired
    private NacosDiscoveryProperties nacosDiscoveryProperties;

    @Autowired
    ThreadLocal<ServerWebExchange> serverWebExchangeThreadLocal;

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object key) {

        try {
            return new NacosServer(chooseInstance(serverWebExchangeThreadLocal.get()));
        }
        catch (Exception e) {
            log.warn("NacosRule error", e);
            return null;
        }
    }


    public Instance chooseInstance(ServerWebExchange exchange) throws NacosException {
        //获取集群名称
        String clusterName = this.nacosDiscoveryProperties.getClusterName();
        //获取可用服务列表
        DynamicServerListLoadBalancer loadBalancer = (DynamicServerListLoadBalancer) getLoadBalancer();
        
        //获取服务名称
        String name = loadBalancer.getName();

        if (name.contains("com.zzd")) {
            name = "providers:" + name;
        }

        //所有可用服务（全部）
        NamingService namingService = this.nacosDiscoveryProperties
                .namingServiceInstance();
        List<Instance> instances = namingService.selectInstances(name, true);
        if (CollectionUtils.isEmpty(instances)) {
            log.warn("no instance in service {}", name);
            return null;
        }

        //获取对应需要的服务列表
         /*List<Instance> instancesToChoose = instances;
        if (StringUtils.isNotBlank(clusterName)) {
            List<Instance> sameClusterInstances = instances.stream()
                    .filter(instance -> Objects.equals(clusterName,
                            instance.getClusterName()))
                    .collect(Collectors.toList());
            if (!CollectionUtils.isEmpty(sameClusterInstances)) {
                instancesToChoose = sameClusterInstances;
            }
            else {
                log.warn(
                        "A cross-cluster call occurs，name = {}, clusterName = {}, instance = {}",
                        name, clusterName, instances);
            }
        }*/


        //根据请求是否灰度判断
        final HttpHeaders headers = exchange.getRequest().getHeaders();
        final List<String> strings = headers.get(GRAYSCALE_KEY);
        List<Instance> instancesToChoose = instances;
        if (isGrayscale(strings)) {
            instancesToChoose = GrayscaleService(instances, strings);
            //当灰度接口请求时，并没有设置灰度服务器
            if (instancesToChoose.isEmpty()) {
                return ExtendBalancer.getHostByRandomWeight2(instancesToChoose);
            }
        }
        serverWebExchangeThreadLocal.remove();
        //如果只有一个实例，就不走权重负载均衡
        if (instancesToChoose.size() == 1) {
            return instancesToChoose.get(0);
        }

        return ExtendBalancer.getHostByRandomWeight2(instancesToChoose);
    }

    private List<Instance> GrayscaleService(List<Instance> instances, List<String> serverVersions) {
        String serverVersion = serverVersions.get(0).trim();

        final List<Instance> rayscaleInstances = instances.stream().filter(i -> i.getMetadata().get("version").equals(serverVersion)).collect(Collectors.toList());
        return rayscaleInstances.isEmpty() ? instances : rayscaleInstances;
    }

    private boolean isGrayscale(List<String> serverVersions) {
        //判断有没有出现灰度发布信号
        if (null == serverVersions || serverVersions.isEmpty() || serverVersions.get(0).trim().isEmpty()) {
            return false;
        }
        return true;
    }


}
