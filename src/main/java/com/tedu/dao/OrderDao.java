package com.tedu.dao;

import com.tedu.entity.Order;
import com.tedu.entity.OrderItem;

import java.util.List;

public interface OrderDao {
    public Integer insertOrder(Order order);
    public void insertOrderItem(OrderItem orderItem);
    public List<Order> selectOrder(Integer uid);
    public void deleteOrder(int oid);
}
