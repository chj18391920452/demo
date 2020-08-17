package com.chj.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @SentinelResource("test")
    public void test(){
        System.out.println("test");
    }
}
