package com.tedu.dao;

import com.tedu.entity.Product;

import java.util.List;
import java.util.Map;

public interface ProductDao {
    //根据商品id查询一件商品
    public Product getById(Integer id);
    //根据商品类别id查询商品的数量
    public int getCountByCid(Integer cid);
    //根据商品类别id、分页起始值、每页的数量分页查询商品
    public List<Product> listAllByCid(Integer cid);
}
