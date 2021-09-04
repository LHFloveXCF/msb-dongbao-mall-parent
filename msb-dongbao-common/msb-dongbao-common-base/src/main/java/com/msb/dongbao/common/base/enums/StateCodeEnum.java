package com.msb.dongbao.common.base.enums;

public enum StateCodeEnum {
    SUCCESS(200,"请求成功"),
    FAIL(102,"请求失败"),
    ;
    private int code;
    private String desc;

    StateCodeEnum(int code, String desc) {
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
