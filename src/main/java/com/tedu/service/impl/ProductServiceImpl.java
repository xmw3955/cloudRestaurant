package com.tedu.service.impl;


import com.tedu.dao.ProductDao;
import com.tedu.entity.PageRecord;
import com.tedu.entity.Product;

import com.tedu.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductDao productDao ;

    @Override
    public Product getById(Integer id) {
        Product product = productDao.getById(id);
        return product;
    }
    @Override
    public List<Product> listAllByCid(Integer cid) {
//        Integer count = productDao.getCountByCid(cid);//获取商品的数量
//        Integer pageCount = (count - 1)/pageSize + 1;//计算总页数
//        Integer recordIndex = (currentPage - 1)*pageSize;//计算分页查询的起始值
//        Map map=new HashMap();
//        map.put("cid",cid);
//        map.put("currentPage",currentPage);
//        map.put("pageSize",pageSize);
        List<Product> data = productDao.listAllByCid(cid);
        System.out.println(data);
       // PageRecord pageRecord = new PageRecord(pageSize, count, pageCount, currentPage, data);
        return data;
    }
}
