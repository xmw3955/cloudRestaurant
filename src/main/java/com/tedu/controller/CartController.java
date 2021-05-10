package com.tedu.controller;

import com.tedu.entity.Cart;
import com.tedu.entity.User;
import com.tedu.entity.vo.CartVo;
import com.tedu.service.ICartService;
import com.tedu.service.IProductService;
import com.tedu.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/carts")
public class CartController {
    @Autowired
    private ICartService cartService;
    @Autowired
    private IProductService productService;
    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public JsonResult save( Integer num, Integer pid,Integer uid,Double price) {
//        Integer pid = Integer.parseInt(req.getParameter("pid"));
//        Integer num = Integer.parseInt(req.getParameter("num"));
//        resp.setContentType("text/html; charset=utf-8");
//        PrintWriter out = resp.getWriter();
//        HttpSession session = req.getSession();
        //获取session中的登录用户



            Cart cart = new Cart();
            cart.setNum(num);
            cart.setPid(pid);
            cart.setUid(uid);
            cart.setPrice(price);
        System.out.println(cart);
       //     System.out.println(user);
            cartService.save(cart);
         //   out.write("success");

        return JsonResult.getSuccessJR();
    }
    @CrossOrigin
@RequestMapping(value = "list")
@ResponseBody
    public JsonResult list(Integer uid) {
//        resp.setContentType("text/html; charset=utf-8");
//        PrintWriter out = resp.getWriter();
//        HttpSession session = req.getSession();
        //获取session中的登录用户
    JsonResult jr=new JsonResult();
     //   User user = (User) session.getAttribute("loginUser");
        if(uid == null) {
           System.out.println("error"+uid);
           return new JsonResult(1000,"error");
        }
        else {

            List<CartVo> carts = cartService.listCart(uid);
//            for(CartVo cart :carts){
//
//            }
            jr.setData(carts);
            jr.setState(1000);
            System.out.println(jr);
         //   out.write(new JsonUtil().toJson(JsonResult.getSuccessJR(carts)));
        }
    return jr;
    }
    @CrossOrigin
    @RequestMapping(value = "/findByCids",method =RequestMethod.GET)
    @ResponseBody
    public JsonResult findByCids(String cids){
        String strs[]=cids.split(",");
        List<Integer> cds=new ArrayList<>();
        for(String str:strs){
            cds.add(Integer.parseInt(str));
        }
       List<CartVo> cartVos= cartService.findByCids(cds);
     return  JsonResult.getSuccessJR(cartVos);
    }
}
