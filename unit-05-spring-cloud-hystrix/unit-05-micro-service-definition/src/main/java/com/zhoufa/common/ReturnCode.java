package com.zhoufa.common;

/**
 * @author Created by zhoufangan on 2017/11/9.
 *         返回码
 */
public enum ReturnCode {
    SUCCESS(0, "成功"), ERROR(1, "失败");

    private int code;
    private String desc;

    ReturnCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
