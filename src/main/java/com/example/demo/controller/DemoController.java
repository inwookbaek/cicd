package com.example.demo.controller;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "{'id':'gilbaek', 'name':'jenkins - CICD', 'port':'8999'}";
    }

    @GetMapping("/hi")
    @ResponseBody
    public String hi() {
        return "Hi!!!0000000000000000";
    }
}
