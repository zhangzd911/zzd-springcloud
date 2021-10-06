package com.zzd.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzd.dao.AgentZoneDao;
import com.zzd.dto.AgentZoneDto;
import com.zzd.entity.AgentZone;
import com.zzd.mapper.AgentZoneMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class DemoService {


    @Resource
    private AgentZoneDao agentZoneDao;

    @Resource
    private AgentZoneMapper agentZoneMapper;


    public String getUser() {
        return "我是service impl";
    }

    //限流规则
    @SentinelResource(value = "sentinelTest",blockHandler = "sentinelTestBack")
    public String sentinelTest() {
        return "sentinelTest";
    }

    public AgentZone jpaDemo() {

        Optional<AgentZone> agentZone = agentZoneDao.findById("007b4c0d4683a6e6387598976286d930");

        return agentZone.get();
    }


    /*public Student getByMyBatis() {
        System.out.println("66666" + studentMapper.getOtherDataBaseTable());

        final String previousTraceId = MDC.get("traceId");
        final String previousParentId = MDC.get("parentId");
        final String previousSpanId = MDC.get("spanId");
        final String spanExportable = MDC.get("spanExportable");
        System.out.println("previousTraceId:" + previousTraceId);
        System.out.println("previousParentId:" + previousParentId);
        System.out.println("previousSpanId:" + previousSpanId);
        System.out.println("spanExportable:" + spanExportable);
        return studentMapper.getUser();
        //return studentRepository.findById(10).get();
    }*/


    public String sentinelTestBack(BlockException e) {

        return "我被降级了....";
    }

    public AgentZone mybatisDemo() {

        return agentZoneMapper.byid("007b4c0d4683a6e6387598976286d930");
    }

    public IPage<AgentZone> mybatisPageDemo() {
        IPage<AgentZone> page = new Page<AgentZone>(1,5);
        return agentZoneMapper.list(page);
    }

    public AgentZoneDto mybatisMapperOtherEntity() {

        return agentZoneMapper.byMapperOtherEntity("007b4c0d4683a6e6387598976286d930");

    }
}
