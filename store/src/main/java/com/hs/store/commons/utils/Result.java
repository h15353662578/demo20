package com.hs.store.commons.utils;

import java.io.Serializable;

/**
 * @author 华生
 * 2020/11/9
 */
public class Result implements Serializable {

    private boolean success;//是否成功
    private String message;//返回信息

    public Result(boolean success, String message) {
        super();
        this.success = success;
        this.message = message;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
