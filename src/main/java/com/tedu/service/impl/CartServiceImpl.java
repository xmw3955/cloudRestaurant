package com.tedu.service.impl;

import com.tedu.dao.CartDao;
import com.tedu.entity.Cart;
import com.tedu.entity.Product;
import com.tedu.entity.User;
import com.tedu.entity.vo.CartVo;
import com.tedu.service.ICartService;
import com.tedu.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CartServiceImpl implements ICartService {
    @Autowired
    private CartDao cartDao;
    @Autowired
    private IProductService productService;
    @Override
    public void save(Cart cart) {
        //判断购物车中是否有该商品

        cart.setPid(cart.getPid());
        Cart newCart = cartDao.getByUidAndPid(cart );
        System.out.println(newCart);
        if(newCart == null) {
//            Product product = productService.getById(cart.getPid());
//            Double price = new Double(product.getProductPrice());
//            cart.setPrice(price);
//            Map<String,Object> map=new HashMap<>();
//         cart.setCreatedUser(user.getUsername());
//     cart.setModifiedUser(user.getUsername());
            cartDao.save(cart);
        }
        else {
            //修改商品数量
            newCart.setNum(newCart.getNum() + cart.getNum());
        //    newCart.setModifiedUser(user.getUsername());
          //  newCart.setCid(cart.getCid());
            cartDao.updateNum(newCart);
        }
    }

    @Override
    public List<CartVo> listCart(Integer uid) {
        return cartDao.listCart(uid);
    }

    @Override
    public List<CartVo> findByCids(List<Integer> cids) {
        return cartDao.findByCids(cids);
    }


}
