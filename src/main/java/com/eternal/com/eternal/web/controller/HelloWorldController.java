package com.eternal.com.eternal.web.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lijun on 17-9-9.
 */
@RestController
public class HelloWorldController {
    @Value("${myConfig.name}")
    private String name;

    @RequestMapping("/hello/{name}")
    public Object hello(@PathVariable("name") String name) {
        JSONObject obj = new JSONObject(16, true);
        obj.put("name in conf:", this.name);
        obj.put("name in path", name);
        return obj;
    }
}
