package com.example.mybatis_demo.mapper;

import com.example.mybatis_demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface UserMapper {
    /***查***/
    List<User> findAll();
    String getPassword(@Param("username") String username);
    /***增***/
    int addUser(User user);
    /***改***/
    int updateUser(User user);
}
