package com.example.mybatis_demo.entity;

public class User  {
    private int id;//数据库中的id
    private String username;//数据库中的用户名
    private String password;//数据库中的密码
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString(){
        return "[id:"+id+", username:"+username+", password:"+password+"]";
    }
}
