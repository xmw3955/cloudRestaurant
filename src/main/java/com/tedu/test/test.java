package com.tedu.test;


import com.tedu.entity.Category;

import com.tedu.entity.Product;
import com.tedu.service.ICategoryService;

import com.tedu.service.IProductService;
import com.tedu.service.IUserService;
import com.tedu.service.impl.ProductServiceImpl;
import com.tedu.service.impl.UserSerivceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {
    @Autowired
    private UserSerivceImpl userSerivce ;

    @Test
    public void test(){
        userSerivce.updateAccount(20,11);


    }
}
