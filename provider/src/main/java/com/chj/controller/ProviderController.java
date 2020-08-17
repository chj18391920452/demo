package com.chj.controller;

import com.chj.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Value("${server.port}")
    private String port;
    @GetMapping("/index")
    public String index(){
        return "端口："+this.port;
    }
    @GetMapping("/list")
    public  String list(){
       return "list";
    }
    @Autowired
     private HelloService helloService;
    @GetMapping("/test1")
    public String test1(){
        this.helloService.test();
        return "test1";
    }
    @GetMapping("/test2")
    public String test2(){
        this.helloService.test();
        return "test2";
    }
}

