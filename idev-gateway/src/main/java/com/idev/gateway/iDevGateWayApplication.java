package com.idev.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class iDevGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(iDevGateWayApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){
        return "Hello iDev GateWay Application2 " +
                ", based on Spring Boot Framework!";
    }

    /**
     * 自定义路由规则
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // basic proxy
                .route(r -> r.path("/10100")
                        .uri("http://localhost:10100/idev"))
                .build();
    }

}
