package com.chj.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class  ConsumerConfiguration {
    //从Ioc中获取提供者提供的资源
    //使用Template来获取Ioc中的服务提供者（provider）提供的服务
    @Bean
    @LoadBalanced
    //@LoadBalanced相当于在IoC容器中添加负载均衡的配置类
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
