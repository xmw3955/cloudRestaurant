package com.tedu.controller;

import com.tedu.entity.Order;
import com.tedu.entity.User;
import com.tedu.service.IOrderService;
import com.tedu.service.IUserService;
import com.tedu.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private IOrderService orderService;
    @Autowired
    private IUserService iUserService;
    @CrossOrigin
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    //创建订单
    public JsonResult create(Integer uid, String recv_name, String recv_phone,
                             Long price, HttpSession session) {

        // uid, recv_name, recv_phone,
        //            price,created_time
        int account=iUserService.selectAccount(uid);
        if(account<price){
            return new JsonResult(500, "账户余额不足");
        }
        else {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String datetimeStr = sdf.format(date);
            System.out.println(date);
            orderService.insertOrder(uid, recv_name, recv_phone, price, datetimeStr);
            return new JsonResult(1000,"购买成功");
        }
        }
        //查询订单
    @CrossOrigin
    @RequestMapping(value = "/select", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult selectorder(Integer uid, HttpSession session) {

//            Date date = new Date();
          List<Order> orders=  orderService.selectOrder(uid);
            return JsonResult.getSuccessJR(orders);
        }
    @CrossOrigin
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public JsonResult deleteOrder(int oid){
        orderService.deleteOrder(oid);
        return JsonResult.getSuccessJR();
    }
    }

