package com.tedu.controller;

import com.tedu.entity.PageRecord;
import com.tedu.entity.Product;
import com.tedu.service.IProductService;
import com.tedu.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import com.tedu.service.impl.ProductServiceImpl;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService ;
    @CrossOrigin
    @RequestMapping(value = "/{id}/get",method = RequestMethod.GET)
    @ResponseBody
    public JsonResult getById(@PathVariable Integer id) {

      Product product = productService.getById(id);
        return JsonResult.getSuccessJR(product);

    }
    @CrossOrigin
    @RequestMapping(value = "/{id}/findProductByCid",method = RequestMethod.GET)
    @ResponseBody
    public JsonResult listAllByCid(@PathVariable Integer id) {
//        JsonResult jr=new JsonResult();
//        jr.setState(1000);
 List<Product> product= productService.listAllByCid(id);
//        jr.setData(pageRecord);
//                return jr;
        return JsonResult.getSuccessJR(product);
    }
}
