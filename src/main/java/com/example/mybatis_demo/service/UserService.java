package com.example.mybatis_demo.service;
import com.example.mybatis_demo.entity.User;
import java.util.List;

public interface UserService {
    /***查***/
    List<User> findAll();
    String getPassword(String username);
    /***增***/
    int addUser(String username, String password);
    /***改***/
    int updateUser(String username, String password, String newpassword);
}
