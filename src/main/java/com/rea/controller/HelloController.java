package com.rea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@Controller
public class HelloController {
//    @GetMapping("/hello")
    @RequestMapping("hello")
//    @ResponseBody
    public String hello(){
        return "Hello,Spring Boot!";
    }
}
