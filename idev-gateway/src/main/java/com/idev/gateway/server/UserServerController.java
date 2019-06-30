package com.idev.gateway.server;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserServerController {

    @Qualifier("eurekaClient")
    @Autowired
    EurekaClient eurekaClient;

    @GetMapping("/user/{id}")
    String getUserById(@PathVariable Long id) {
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("idev-biz-admin", false);
        Map urlVariables = new HashMap();
        urlVariables.put("hostName", instanceInfo.getHostName());
        urlVariables.put("port", instanceInfo.getPort());
        System.out.println("http://" + instanceInfo.getHostName()
                + ":"+ instanceInfo.getPort() + "/user/" + id);
        return "success";
    }
}
