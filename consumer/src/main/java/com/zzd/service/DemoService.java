package com.zzd.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zzd.mapper.StudentMapper;
import com.zzd.entity.Student;
import com.zzd.dao.StudentDao;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class DemoService {

    @Resource
    private StudentMapper studentMapper;

    @Autowired
    private StudentDao studentDao;


    public String getUser() {
        return "我是service impl";
    }

    //限流规则
    @SentinelResource(value = "sentinelTest",blockHandler = "sentinelTestBack")
    public String sentinelTest() {
        return "sentinelTest";
    }


    public Student getByMyBatis() {
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
    }

    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public Student getByJpa() {
        return studentDao.findById(10).get();
    }

    public String sentinelTestBack(BlockException e) {

        return "我被降级了....";
    }
}
