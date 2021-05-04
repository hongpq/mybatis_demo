package com.example.mybatis_demo.mapper;

import com.example.mybatis_demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
    int addUser(User user);
    String getPassword(@Param("username") String username);
}
