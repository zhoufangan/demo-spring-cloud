package com.zhoufa.response;

/**
 * @author Created by zhoufangan on 2017/11/9.
 *         统一返回模型
 */
public class ResultModel {

    private int code;
    private String message;
    private Object data;

    public ResultModel() {

    }

    public ResultModel(ReturnCode returnCode) {
        this.code = returnCode.getCode();
        this.message = returnCode.getDesc();
    }

    public ResultModel(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultModel(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
