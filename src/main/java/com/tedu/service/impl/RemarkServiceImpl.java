package com.tedu.service.impl;

import com.tedu.dao.RemarkDao;
import com.tedu.entity.Remark;
import com.tedu.service.IRemarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RemarkServiceImpl implements IRemarkService {
    @Autowired
    RemarkDao remarkDao;
    public List<Remark> getAllRemark(Integer pid){
       List<Remark> remarks= remarkDao.getAllRemark(pid);
       return  remarks;
    }
    public void saveRemark(Remark remark){
        remarkDao.saveRemark(remark);
    }
}
