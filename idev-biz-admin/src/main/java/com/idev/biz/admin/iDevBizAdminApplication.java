package com.idev.biz.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@MapperScan("com.idev.biz.admin.mapper")
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
