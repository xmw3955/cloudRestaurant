package com.tedu.dao;

import com.tedu.entity.User;

import java.util.Map;

public interface UserDao {
    //判断用户名是否重复
    public int getByUserName(String username);
    //用户注册
    public void regist(User user);
    //用户登录
    public User login(String username);
    public void updateAccount(Map map);
    public  int selectAccount(Integer uid);
    public  void updateUser(User user);
}