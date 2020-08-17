package com.chj.controller;

import com.chj.feign.ProvierFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    //restTemplate调用服务的
    private RestTemplate restTemplate;
    //discoveryClien进行服务的发现
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private ProvierFeign provierFeign;

/*
这是手写的一个负载均衡
 */
    //    @GetMapping("/test")
//    public String test(){
//        //查询Nacos中已经存在的服务
//        List<ServiceInstance> list = this.discoveryClient.getInstances("provider");
//        List<String> urls = list.stream()
//                .map(e->e.getUri().toString()+"/index").collect(Collectors.toList());
//        int index = ThreadLocalRandom.current().nextInt(urls.size());
//        String url = urls.get(index);
//        log.info("请求的地址是：{}", url);
//        return this.restTemplate.getForObject(url, String.class);
//    }
    @GetMapping("/test")
    public String test(){
        //return this.restTemplate.getForObject("http://provider/index", String.class);
        return this.provierFeign.index();
    }

}
