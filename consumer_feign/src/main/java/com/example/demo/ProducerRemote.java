package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "producer",fallback = ProducerRemoteHystrix.class)
public interface ProducerRemote {
    @GetMapping("/api/v1/demo/producer")
    String producer();
}
