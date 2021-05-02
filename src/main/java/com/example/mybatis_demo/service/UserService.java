package com.example.mybatis_demo.service;
import com.example.mybatis_demo.entity.User;
import java.util.List;

public interface UserService {
    List<User> findAll();
    String getPassword(String username);
}
