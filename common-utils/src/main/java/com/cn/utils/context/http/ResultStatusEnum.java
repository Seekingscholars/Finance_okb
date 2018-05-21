package com.cn.utils.context.http;


/**
 * 公用常量类定义
 * @author nmnl
 * @version 1.0
 * @data 20180403 14:34
 */
public enum ResultStatusEnum {
    SUCCEED_CODE_VALUE               				(1000,"接口调用成功"),
    FAIL_CODE_VALUE               					(1001,"接口调用失败:内部移除导致.");
    //OTHER_CODE_VALUE               					(1002,"接口调用失败:其他错误导致.");
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String message;

    ResultStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }
}
