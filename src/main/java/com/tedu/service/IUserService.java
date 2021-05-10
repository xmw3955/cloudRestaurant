package com.tedu.service;

import com.tedu.entity.User;

import java.util.Map;

public interface IUserService {
    public Boolean checkUsername(String username);
    public void regist(User user);
    public User login(String username, String password);
    public void updateAccount(double price,int uid);
    public int selectAccount(Integer uid);
    public  void updateUser(User user);
}
