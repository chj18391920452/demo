package com.chj.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("provider")
public interface ProvierFeign {

    @GetMapping("/index")
    public String index();

}
