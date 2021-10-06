package com.zzd.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zzd.entity.User;
import com.zzd.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RefreshScope
public class DemoController {


    @Autowired
    private DemoService demoService;



    @Resource
    private RedisTemplate<String,String> redisTemplate;


    @Value("${server.port}")
    private String port;

    /**
     * redis
     * @return
     */
    @GetMapping("/getRedis")
    public String getRedis() {
        return redisTemplate.opsForValue().get("test");
    }

    /**
     * jpa demo
     * @return
     */

    @GetMapping("/jpa")
    public User jpa(){
        return demoService.jpaDemo();
    }

    @GetMapping("/mybatis")
    public User mybatis(){
        return demoService.mybatisDemo();
    }

    @GetMapping("/mybatis/page")
    public IPage<User> mybatisPage(){
        return demoService.mybatisPageDemo();
    }


    @GetMapping("/demo1")
    public String demo1(){
        //int i = 1/0;
        return demoService.getUser();
    }

    @GetMapping("/sentinelTest")
    public String sentinelTest() {
        // 真正的业务逻辑
        // 被保护的资源
        return demoService.sentinelTest();
    }

    /*@GetMapping("/mybatisMapperOtherEntity")
    public AgentZoneDto mybatisMapperOtherEntity(){
        return demoService.mybatisMapperOtherEntity();
    }*/


    /*@PostMapping("/getPort")
    public String getPort(@Validated @RequestBody AgentZoneDto agentZoneDto){
        agentZoneDto.getAgentid();
        return port;
    }*/

    /*@GetMapping("/testHeap")
    public void testHeap(){
        List<String[]> a = new ArrayList<>();
        for (;;) {
            a.add(new String[10*1024]);
        }
    }*/
}
