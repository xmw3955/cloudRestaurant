package com.tedu.entity;

public class Image {
    private Integer productId;
    private  String imageName;
    private Integer imageId;
    private Integer imageStatus;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(Integer imageStatus) {
        this.imageStatus = imageStatus;
    }

    public Image(Integer productId, String imageName, Integer imageId, Integer imageStatus) {
        this.productId = productId;
        this.imageName = imageName;
        this.imageId = imageId;
        this.imageStatus = imageStatus;
    }
}
