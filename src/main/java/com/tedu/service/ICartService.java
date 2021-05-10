package com.tedu.service;

import com.tedu.entity.Cart;
import com.tedu.entity.User;
import com.tedu.entity.vo.CartVo;

import java.util.List;

public interface ICartService {
    //添加商品到购物车
    public void save(Cart cart);
    public List<CartVo> listCart(Integer uid);
    public  List<CartVo> findByCids(List<Integer> cids);
}
