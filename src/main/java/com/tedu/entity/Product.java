package com.tedu.entity;

public class Product {
    private Integer productId;
    private String productName;
    private Integer productNum;
    private Integer productSales;
    private String productDesc;
    private Double productPrice;
    private Integer productStatus;
    private Integer categoryId;
    private Integer productImg;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public Integer getProductSales() {
        return productSales;
    }

    public void setProductSales(Integer productSales) {
        this.productSales = productSales;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getProductImg() {
        return productImg;
    }

    public void setProductImg(Integer productImg) {
        this.productImg = productImg;
    }

    public Product(Integer productId, String productName, Integer productNum, Integer productSales, String productDesc, Double productPrice, Integer productStatus, Integer categoryId, Integer productImg) {
        this.productId = productId;
        this.productName = productName;
        this.productNum = productNum;
        this.productSales = productSales;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
        this.productStatus = productStatus;
        this.categoryId = categoryId;
        this.productImg = productImg;
    }
}
