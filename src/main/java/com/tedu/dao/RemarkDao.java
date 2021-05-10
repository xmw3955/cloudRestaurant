package com.tedu.dao;

import com.tedu.entity.Remark;

import java.util.List;

public interface RemarkDao {
    public List<Remark> getAllRemark(Integer pid);
    public void saveRemark(Remark remark);
}
