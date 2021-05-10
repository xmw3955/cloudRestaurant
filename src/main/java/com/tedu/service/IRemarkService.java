package com.tedu.service;

import com.tedu.entity.Remark;

import java.util.List;

public interface IRemarkService {
    public List<Remark> getAllRemark(Integer pid);
    public void saveRemark(Remark remark);
}
