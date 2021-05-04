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

    /***查***/
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public String getPassword(String username) {
        return userMapper.getPassword(username);
    }
    //验证密码方法
    public int isPass(String username, String password) {
        String truePassword =getPassword(username);
        if (truePassword == null) return 2;
        if (password.equals(truePassword))
            return 1;
        else return 0;
    }

    /***增***/
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    /***改***/
    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
