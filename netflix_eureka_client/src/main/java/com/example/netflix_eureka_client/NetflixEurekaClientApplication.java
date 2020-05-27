package com.example.netflix_eureka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class NetflixEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaClientApplication.class, args);
    }

}
