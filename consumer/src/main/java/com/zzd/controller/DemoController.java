package com.zzd.controller;


import com.alibaba.fastjson.JSONObject;
import com.zzd.feign.ProducerFeignService;
import com.zzd.service.DemoService;

import com.zzd.util.RedisUtil;
import com.zzd.util.ResultMsg;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/demo")
@RefreshScope
@Api(tags = "光海SpringCloud架构测试")
public class DemoController {


    @Autowired
    private DemoService demoService;


    @Value("${my.config.demo}")
    private String demoStr;

    @Resource
    private ProducerFeignService producerFeignService;

    @Value("${server.port}")
    private String port;

    @Autowired
    private RedisUtil redisUtil;


    /**
     * swagger 注解参数解释
     * name:参数名  value：参数描述  defaultValue：默认请求接口参数值  dataType：参数类型  required：是否必填
     * paramType：
     *     header-->请求参数的获取：@RequestHeader(代码中接收注解)
     *     query-->请求参数的获取：@RequestParam(代码中接收注解)
     *     path（用于restful接口）-->请求参数的获取：@PathVariable(代码中接收注解)
     *     body-->请求参数的获取：@RequestBody(代码中接收注解)
     *
     */
    @ApiOperation("swagger获取单个参数demo")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名", defaultValue = "张三", dataType = "String",paramType="query", required = true),
            @ApiImplicitParam(name = "sex", value = "性别1：男，2：女", defaultValue = "1", dataType = "int",paramType="query", required = true)

    })
    @ResponseBody
    @GetMapping("/swaggerDemo")
    public ResultMsg<String> swaggerDemo(@RequestParam String name, @RequestParam String sex){
        ResultMsg<String> result = new ResultMsg<String>();
        result.setCode("201");
        result.setMsg("保存成功");
        result.setData("姓名：" + name + ",性别：" + sex + ",port:" + port);
        return result;
    }

    @ApiOperation("swagger获取单个参数demo")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名", defaultValue = "张三", dataType = "String",paramType="query", required = true),
            @ApiImplicitParam(name = "sex", value = "性别1：男，2：女", defaultValue = "1", dataType = "int",paramType="query", required = true)

    })
    @ResponseBody
    @GetMapping("/swaggerDemo2")
    public String swaggerDemo2(){

        return demoStr + ":" + "port:" + port;
    }

    @ResponseBody
    @GetMapping("/testFegin")
    public String testtFegin(){
        return producerFeignService.demo1();
    }

    @ResponseBody
    @GetMapping("/testDubboFegin")
    public String testDubboFegin(@RequestParam Long campusid, @RequestParam Long userid){
        JSONObject params = new JSONObject();
        params.put("campusid", campusid);
        params.put("userid", userid);

        //return providerService.listStu(params);
        return "";
    }


    @ResponseBody
    @GetMapping("/testRedis")
    public String testRedis(){
        redisUtil.hset("hash1","a","a");
        return redisUtil.hmget("hash1")+"";
    }





























    /*@ApiOperation("添加用户的接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四", dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "address", value = "用户地址", defaultValue = "深圳", dataType = "String",paramType="query", required = true)
    })
    @GetMapping("/getRedis")
    public String getRedis(@RequestParam String username, @RequestParam  String address) {
        System.out.println(username);
        System.out.println(address);
        String test = redisTemplate.opsForValue().get("test");
        return "test";
    }

    @GetMapping("/getByMyBatis")
    public Student getByMyBatis() {

        return demoService.getByMyBatis();
    }

    @GetMapping("/getByJpa")
    public Student getByJpa() {

        return demoService.getByJpa();
    }


    @GetMapping("/demo")
    public String demo() {
        return demo;
    }

    @GetMapping("/demo1")
    public String demo1() {
        return demoService.getUser();
    }

    @GetMapping("/sentinelTest")
    public String sentinelTest() {
        // 真正的业务逻辑
        // 被保护的资源
        return demoService.sentinelTest();
    }


    @GetMapping("/demo2")
    public String demo2() {
        return feginService.demo1();
    }*/

}
