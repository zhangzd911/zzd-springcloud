package com.zzd.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "producer",fallback = ProducerFeignServiceFallbackFactory.class)
public interface ProducerFeignService {


    @GetMapping("/demo1")
    String demo1();



}
