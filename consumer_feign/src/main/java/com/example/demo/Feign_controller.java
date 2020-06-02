package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/v1/demo")
public class Feign_controller {
    @Autowired
    ProducerRemote remote;


    @GetMapping("/get")
    public String producer()
    {
        return remote.producer();
    }
}
