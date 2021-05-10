package com.tedu.entity;


import java.util.Date;

public class Remark {
    private Integer remark_id;
    private Integer pid;
    private Integer uid;
    private String content;
    private String createdDate;
    private String username;
    private String img;

    public Remark(Integer remark_id, Integer pid, Integer uid, String content, String createdDate, String username, String img) {
        this.remark_id = remark_id;
        this.pid = pid;
        this.uid = uid;
        this.content = content;
        this.createdDate = createdDate;
        this.username = username;
        this.img = img;
    }

    public Integer getRemark_id() {
        return remark_id;
    }

    public void setRemark_id(Integer remark_id) {
        this.remark_id = remark_id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
