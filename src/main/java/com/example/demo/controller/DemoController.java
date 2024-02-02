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

    @GetMapping("/hi1")
    @ResponseBody
    public String hi1() {
        return "Hi!!! 1111111111111111";
    }

    @GetMapping("/hi2")
    @ResponseBody
    public String hi2() {
        return "Hi!!! 2222222222222222";
    }

    @GetMapping("/hi3")
    @ResponseBody
    public String hi2() {
        return "Hi!!! 33333333333333333";
    }
}
