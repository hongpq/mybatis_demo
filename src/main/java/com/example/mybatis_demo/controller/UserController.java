package com.example.mybatis_demo.controller;

import com.example.mybatis_demo.entity.User;
import com.example.mybatis_demo.service.impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceimpl userServiceimpl;

    @CrossOrigin
    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userServiceimpl.findAll();
    }

    @CrossOrigin
    @RequestMapping("/isPass")
    public Boolean isPass(String username, String password) {
        boolean ispass = userServiceimpl.isPass(username,password);
        return ispass;
    }

}


