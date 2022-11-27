package com.ys.model;

public enum TransferStatus {
    SUCESS("sucess", "成功"),
    FAIL("fail","失败");


    String code;
    String desc;

    TransferStatus(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
