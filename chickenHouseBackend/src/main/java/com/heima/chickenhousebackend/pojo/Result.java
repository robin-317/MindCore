package com.heima.chickenhousebackend.pojo;

public class Result {
    private int code; //状态码
    private String msg; //消息
    private Object data; //数据

    //成功响应（无数据）
    public static Result success() {
        return new Result(200,"success",null);
    }

    //成功响应（带数据）
    public static Result success(Object data) {
        return new Result(200,"success",data);
    }

    //失败响应
    public static Result error(String msg) {
        return new Result(500,msg,null);
    }
    //



    public Result() {
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public String toString() {
        return "Result{code = " + code + ", msg = " + msg + ", data = " + data + "}";
    }
}
