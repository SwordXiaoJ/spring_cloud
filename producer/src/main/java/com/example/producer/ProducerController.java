package com.example.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/v1/demo")
public class ProducerController {

    @GetMapping("/producer")
    public String producer()
    {
        return "Hello,XXX "+new Date();
    }
}
