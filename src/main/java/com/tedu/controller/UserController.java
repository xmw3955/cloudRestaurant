package com.tedu.controller;

import com.tedu.entity.User;

import com.tedu.service.IUserService;
import com.tedu.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService ;
    @CrossOrigin
    @RequestMapping(value = "regist",method = RequestMethod.GET)
    @ResponseBody
    public JsonResult regist(User user){
        user.setAccount(400.0);
        userService.regist(user);
     return JsonResult.getSuccessJR();
    }
    //检查用户名是否存在
    @CrossOrigin
    @RequestMapping(value = "checkUsername",method = RequestMethod.GET)
    @ResponseBody
    public JsonResult checkUsername(String username){

        boolean checkUsername = userService.checkUsername(username);
        JsonResult jr=new JsonResult();
        if(checkUsername) {
           // out.write("{\"state\":1000,\"msg\":\"true\"}");

            jr.setMsg("true");
            jr.setState(1000);
        }
        else {

            jr.setMsg("false");
            jr.setState(1000);
        }
        return jr;
    }
    @CrossOrigin
    @RequestMapping(value = "login",method = RequestMethod.GET)
    @ResponseBody
    public JsonResult login(String username, String password, HttpSession session){
        JsonResult jr=new JsonResult();
//        String text= (String)request.getSession().getAttribute("text");
//        System.out.println(yzm_img);
//if(text.equals(yzm_img)) {
    User loginUser = userService.login(username, password);
    System.out.println("login" + loginUser);
    session.setAttribute("loginUser", loginUser);

    if (loginUser != null) {
        jr.setMsg("true");
        jr.setState(1000);
        return JsonResult.getSuccessJR(loginUser);
    } else {
        jr.setState(500);
        jr.setMsg("用户名或者密码错误");
    }
//}
//else{
//    jr.setState(500);
//    jr.setMsg("验证码出错");
//}
        return jr;
    }
    @CrossOrigin
    @RequestMapping(value = "update",method = RequestMethod.GET)
    @ResponseBody
    public  JsonResult updateUser(User user){
        System.out.println(user);
        userService.updateUser(user);
        return new JsonResult(1000,"修改成功");
    }
    @CrossOrigin
    @RequestMapping(value = "updateAccount",method = RequestMethod.GET)
    @ResponseBody
    public  JsonResult updateUserAccount(Double price,Integer uid){

        userService.updateAccount(price,uid);
        return new JsonResult(1000,"修改成功");
    }
    @CrossOrigin
    @RequestMapping(value = "selectAccount",method = RequestMethod.GET)
    @ResponseBody
    public  JsonResult selectUserAccount(Integer uid){
      return  JsonResult.getSuccessJR( userService.selectAccount(uid));
    }
}
