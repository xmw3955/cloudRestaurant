package com.tedu.service.impl;


import com.tedu.dao.CategoryDao;
import com.tedu.entity.Category;

import com.tedu.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private CategoryDao categoryDao ;
    @Override
    public List<Category> list() {
        return categoryDao.list();
    }
}
