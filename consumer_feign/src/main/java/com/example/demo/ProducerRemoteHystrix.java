package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ProducerRemoteHystrix implements ProducerRemote{
    @Override
    public String producer() {
        return "Hello world";
    }
}
