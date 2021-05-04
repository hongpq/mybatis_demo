package com.example.mybatis_demo.controller;

import com.example.mybatis_demo.entity.User;
import com.example.mybatis_demo.service.impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceimpl userServiceimpl;
    /***查***/
    @CrossOrigin
    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userServiceimpl.findAll();
    }

    @CrossOrigin
    @RequestMapping("/isPass")
    public int isPass(String username, String password) {
        int ispass = userServiceimpl.isPass(username,password);
        return ispass;
    }

    @GetMapping("/list")
    public Iterable<User> getUsers() {
        return userServiceimpl.findAll();
    }

    /***增***/
    @PostMapping("/add")
    public int addUser(@RequestParam String username, @RequestParam String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        int insertResult = userServiceimpl.addUser(user);
        return insertResult;
    }

}


