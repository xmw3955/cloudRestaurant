package com.tedu.dao;

import com.tedu.entity.Category;

import java.util.List;

public interface CategoryDao {
    //获取所有的类别
    public List<Category> list();
}
