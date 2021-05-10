package com.tedu.util;

import com.tedu.entity.Product;

/**
 * 封装服务器返回的json数据
 */
public class JsonResult<T> {

    private Integer state;
    private String msg;
    private T data;

    public JsonResult(Product product) {
    }

    public static JsonResult<Void> getSuccessJR(){
        return new JsonResult<>(1000,"OK");
    }

    public static <T> JsonResult<T> getSuccessJR(T data){
        return new JsonResult<>(1000,"OK",data);
    }

    public JsonResult() {
    }

    public JsonResult(Integer state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public JsonResult(Integer state, String msg, T data) {
        this.state = state;
        this.msg = msg;
        this.data = data;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "state=" + state +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
