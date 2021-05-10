package com.tedu.service.impl;

import com.tedu.dao.OrderDao;

import com.tedu.entity.Order;
import com.tedu.service.ICartService;
import com.tedu.service.IOrderService;
import com.tedu.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderDao orderDao;
// uid, recv_name, recv_phone,
//            price,created_time
    @Autowired
    private ICartService cartService;
    @Autowired
    private IProductService productService;
    @Autowired
    private UserSerivceImpl userSerivce ;
    @Override
    public void insertOrder(Integer uid, String recv_name, String recv_phone,
                            Long price, String date1) {

        Order order = new Order();
        order.setPrice(price);


        order.setUid(uid);
        order.setRecvName(recv_name);
        order.setRecvPhone(recv_phone);
        order.setDate(date1);
        //保存订单信息,返回订单ID
        Integer oid = orderDao.insertOrder(order);
        userSerivce.updateAccount(price,uid);


//        for(CartVo cartVo:carts) {
//            OrderItem item = new OrderItem();
//            item.setImage(cartVo.getImage());
//            item.setNum(cartVo.getNum());
//            item.setOid(oid);
//            item.setPid(cartVo.getPid());
//            item.setPrice(cartVo.getRealPrice());
//            item.setTitle(cartVo.getTitle());
//            item.setCreatedUser(username);
//            item.setModifiedUser(username);
//            //保存订单详情
//            orderDao.insertOrderItem(item);
//            //删除购物车记录

        }
    public List<Order> selectOrder(Integer uid){
      List<Order> orders=  orderDao.selectOrder(uid);
      return  orders;
    }
    public void deleteOrder(int oid){
        orderDao.deleteOrder(oid);
    }

}
