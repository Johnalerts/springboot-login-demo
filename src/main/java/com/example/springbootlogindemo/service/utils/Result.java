package com.example.springbootlogindemo.service.utils;

public class Result<T> {
    private String id;
    private String msg;
    private T data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Result() {
    }

    public Result(T data) {
        this.data = data;
    }

    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>(data);
        result.setId("1");
        result.setMsg("成功");
        return result;
    }

    public static <T> Result<T> success(T data,String msg) {
        Result<T> result = new Result<>(data);
        result.setId("1");
        result.setMsg(msg);
        return result;
    }

    public static Result error(String id, String msg) {
        Result result = new Result();
        result.setId(id);
        result.setMsg(msg);
        return result;
    }
}
