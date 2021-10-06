package com.zzd.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzd.dao.UserDao;
import com.zzd.entity.User;
import com.zzd.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class DemoService {


    @Resource
    private UserDao userDao;

    @Resource
    private UserMapper userMapper;


    public String getUser() {
        return "我是service impl";
    }

    //限流规则
    @SentinelResource(value = "sentinelTest",blockHandler = "sentinelTestBack")
    public String sentinelTest() {
        return "sentinelTest";
    }

    public User jpaDemo() {

        Optional<User> user = userDao.findById(1);

        return user.get();
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

    public User mybatisDemo() {

        return userMapper.byid("007b4c0d4683a6e6387598976286d930");
    }

    public IPage<User> mybatisPageDemo() {
        IPage<User> page = new Page<User>(1,5);
        return userMapper.list(page);
    }

    /*public AgentZoneDto mybatisMapperOtherEntity() {

        return agentZoneMapper.byMapperOtherEntity("007b4c0d4683a6e6387598976286d930");

    }*/
}
