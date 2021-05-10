package com.tedu.service.impl;

import com.tedu.dao.UserDao;
import com.tedu.entity.User;
import com.tedu.exception.UserException;

import com.tedu.service.IUserService;
import com.tedu.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserSerivceImpl implements IUserService {
    @Autowired
    private UserDao userDao ;

    @Override
    public Boolean checkUsername(String username) {
        int count = userDao.getByUserName(username);
        if(count > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void regist(User user) {
        String newPassword = CodeUtil.getMD5Encoding(user.getPassword());
        user.setPassword(newPassword);
        userDao.regist(user);
    }

    @Override
    public User login(String username, String password) {
        User user = userDao.login(username);
        if(user == null){
           return null;
        }
        if(!CodeUtil.getMD5Encoding(password).equals(user.getPassword())) {
            return null;
        }
        return user;
    }
    public void updateAccount(double price,int uid){
        Map map=new HashMap();
        map.put("price",price);
        map.put("uid",uid);
        userDao.updateAccount(map);
    }
    public int selectAccount(Integer uid){
      return   userDao.selectAccount(uid);
    }
    public  void updateUser(User user){
        String newPassword = CodeUtil.getMD5Encoding(user.getPassword());
        user.setPassword(newPassword);
        userDao.updateUser(user);
    }
}
