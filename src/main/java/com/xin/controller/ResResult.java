package com.xin.controller;

/**
 * @Author Lucas
 * @Date 2019/12/16 9:16
 * @Version 1.0
 */
public class ResResult {
    private boolean success;
    private String message;

    public ResResult() {
    }

    public ResResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
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
