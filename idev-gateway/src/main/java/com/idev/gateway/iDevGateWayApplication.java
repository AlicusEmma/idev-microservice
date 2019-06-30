package com.idev.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaServer
public class iDevGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(iDevGateWayApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){
        return "Hello iDev GateWay Application2 " +
                ", based on Spring Boot Framework!";
    }
}
