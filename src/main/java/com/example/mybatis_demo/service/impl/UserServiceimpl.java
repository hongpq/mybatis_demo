package com.example.mybatis_demo.service.impl;

import com.example.mybatis_demo.entity.User;
import com.example.mybatis_demo.mapper.UserMapper;
import com.example.mybatis_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }


    @Override
    public String getPassword(String username) {
        return userMapper.getPassword(username);
    }
    //验证密码方法
    public Boolean isPass(String username, String password) {
        String truePassword =getPassword(username);
        if (password.equals(truePassword))
            return true;
        else return false;
    }
}
