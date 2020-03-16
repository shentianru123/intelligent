package com.share.intelligent.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public  class JsonResult<T> {

    private Logger log = LoggerFactory.getLogger(JsonResult.class);
    private int code;
    private String msg;
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public JsonResult() {
        this.code=200;
        this.msg=MSG_SUCCESS;
        log.info(this.toString());
    }

    public JsonResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        log.info(this.toString());
    }

    public JsonResult(String msg, T data) {
        this.code = 200;
        this.msg = msg;
        this.data = data;
        log.info(this.toString());
    }

    public JsonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
        log.info(this.toString());
    }

    public  JsonResult(T data) {
        this.code = 200;
        this.data = data;
        this.msg=MSG_SUCCESS;
        log.info(this.toString());
    }


    @Override
    public String toString() {
        return "JsonResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    private static final String MSG_SUCCESS="SUCCESS";
    private static final String MSG_FAILED="FAILED";
}
