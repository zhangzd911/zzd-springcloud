package com.zzd.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProducerFeignServiceFallbackFactory implements ProducerFeignService {

    @Override
    public String demo1() {
        return "不好意思，我熔断了";
    }
}
