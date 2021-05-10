package com.tedu.dao;

import com.tedu.entity.Cart;
import com.tedu.entity.vo.CartVo;

import java.util.List;

public interface CartDao {
    //添加商品到购物车
    public void save(Cart cart);
    //查看购物车中有没有相同的商品
    public Cart getByUidAndPid(Cart cart);
    //修改购物车商品数量
    public void updateNum(Cart cart);
    //用户获取所有的购物车记录
    public List<CartVo> listCart(int uid);
    public  List<CartVo> findByCids(List<Integer> cids);
}
