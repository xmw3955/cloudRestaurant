package com.tedu.controller;

import com.tedu.entity.Remark;
import com.tedu.service.IRemarkService;
import com.tedu.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/remark")
public class RemarkController {
    @Autowired
    IRemarkService iRemarkService;
    @CrossOrigin
    @RequestMapping("/selectAll")
    @ResponseBody
    public JsonResult getAllRemark(Integer pid){
        List<Remark> remarks= iRemarkService.getAllRemark(pid);
        return  JsonResult.getSuccessJR(remarks);
    }
    @CrossOrigin
    @RequestMapping(value="/insertRemark" ,method = RequestMethod.POST)
    @ResponseBody
    public JsonResult saveRemark(Remark remark){
        iRemarkService.saveRemark(remark);
        return JsonResult.getSuccessJR();
    }
}
