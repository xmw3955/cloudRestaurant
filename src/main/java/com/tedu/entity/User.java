package com.tedu.entity;

import java.util.Date;

/**
 * 用户实体类
 */
public class User {
    private Integer uid;
    private String username;
    private String password;
    private String salt;//盐值
    private Integer isDelete;//是否删除:0表示未删除,1表示已删除
    private String phone;//手机号
    private String idCard;//邮箱
    private Integer gender;//性别:0表示女,1表示男
    private String referenceAccount;//头像
    private String createdUser;//创建人
    private Date createdTime;//创建时间
    private String modifiedUser;//修改人
    private Date modifiedTime;//修改时间
 private  Double account;
 private String nickname;

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public User() {

    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getReferenceAccount() {
        return referenceAccount;
    }

    public void setReferenceAccount(String referenceAccount) {
        this.referenceAccount = referenceAccount;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public User(Integer uid, String username, String password, String salt, Integer isDelete, String phone, String idCard, Integer gender, String referenceAccount, String createdUser, Date createdTime, String modifiedUser, Date modifiedTime) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.isDelete = isDelete;
        this.phone = phone;
        this.idCard = idCard;
        this.gender = gender;
        this.referenceAccount = referenceAccount;
        this.createdUser = createdUser;
        this.createdTime = createdTime;
        this.modifiedUser = modifiedUser;
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", isDelete=" + isDelete +
                ", phone='" + phone + '\'' +
                ", idCard='" + idCard + '\'' +
                ", gender=" + gender +
                ", referenceAccount='" + referenceAccount + '\'' +
                ", createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
