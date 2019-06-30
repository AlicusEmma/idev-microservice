package com.idev.biz.admin.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    String getUserById(@PathVariable Long id) {

        JSONObject json = new JSONObject();
        try {
            json.put("id","007");
            json.put("name","Alicus");
            json.put("age","30");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

}
