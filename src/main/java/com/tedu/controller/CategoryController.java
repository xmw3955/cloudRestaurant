package com.tedu.controller;

import com.tedu.entity.Category;

import com.tedu.service.ICategoryService;
import com.tedu.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

@RequestMapping("category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService ;
    @CrossOrigin
@RequestMapping(value = "list")
@ResponseBody
    public JsonResult list(){

        List<Category> categories = categoryService.list();
        System.out.println("categories");
        //转JSON
     //   out.write(new JsonUtil().toJson(JsonResult.getSuccessJR(categories)));
    return JsonResult.getSuccessJR(categories);
    }
}
