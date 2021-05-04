package com.example.mybatis_demo.service;
import com.example.mybatis_demo.entity.User;
import java.util.List;

public interface UserService {
    List<User> findAll();
    int addUser(User user);
    String getPassword(String username);
}
