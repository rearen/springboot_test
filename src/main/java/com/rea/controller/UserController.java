package com.rea.controller;

import com.rea.domain.User;
import com.rea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@RequestMapping()
public class UserController {
    @Autowired
    private UserService userService;

//    @GetMapping("/userinfo")
    @RequestMapping("/userinfo")
//    @ResponseBody
    public User queryById(Long id ){
        User user = userService.queryById(id);
        return user;
    }
}
