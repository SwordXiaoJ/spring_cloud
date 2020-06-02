package com.example.consumer_ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/demo")
public class ConsumerRibbonController {

@Autowired
private LoadBalancerClient client;

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/get")
    public String consumer()
    {
        String url = "http://producer:8763/api/v1/demo/producer";

        return restTemplate.getForObject(url, String.class);
    }
}
