package com.tedu.service;

import com.tedu.entity.Order;

import java.util.Date;
import java.util.List;

public interface IOrderService {
    //保存订单信息
    //参数:aid 地址, cids 购物车记录, uid 用户
    public void insertOrder(Integer uid, String recv_name, String recv_phone,
                            Long price, String date);
    public List<Order> selectOrder(Integer uid);
    public void deleteOrder(int oid);
}
