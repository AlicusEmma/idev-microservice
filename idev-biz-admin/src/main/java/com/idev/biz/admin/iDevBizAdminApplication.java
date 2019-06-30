package com.idev.biz.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableDiscoveryClient
public class iDevBizAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(iDevBizAdminApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){
        return "Hello iDevBizAdminApplication " +
                ", based on Spring Boot Framework!";
    }

}
