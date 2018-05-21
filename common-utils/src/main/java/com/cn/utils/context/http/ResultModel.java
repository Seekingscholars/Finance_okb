package com.cn.utils.context.http;

import java.util.List;

/**
 * 公用常量类定义
 * @author nmnl
 * @version 1.0
 * @data 20180403 14:34
 */
public class ResultModel {

	/**
     * 返回码
     */
    private int code;

    /**
     * 返回结果描述
     */
    private String message;

    /**
     * 返回内容
     */
    private Object data;

    /**
     * 返回分页参数
     */
    private Object page;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public Object getPage() {
        return page;
    }

    private ResultModel(int code, String message) {
        this.code = code;
        this.message = message;
        this.data = "";
    }

    private ResultModel(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private ResultModel(ResultStatusEnum statusEnum) {
        this.code = statusEnum.getCode();
        this.message = statusEnum.getMessage();
        this.data = "";
    }

    private ResultModel(ResultStatusEnum status, Object content) {
        this.code = status.getCode();
        this.message = status.getMessage();
        this.data = content;
    }

    private ResultModel(Object data,Object page) {
        this.code = ResultStatusEnum.SUCCEED_CODE_VALUE.getCode();
        this.message = ResultStatusEnum.SUCCEED_CODE_VALUE.getMessage();
        if (data instanceof List && ((List) data).size() > 0){
            this.data = data;
            this.page = page;
        }
    }

    public static ResultModel ok(Object content) {
        return new ResultModel(ResultStatusEnum.SUCCEED_CODE_VALUE, content);
    }
    
    public static ResultModel ok(String msg) {
        return new ResultModel(ResultStatusEnum.SUCCEED_CODE_VALUE, msg);
    }

    public static ResultModel ok(Object data,Object page) {
        return new ResultModel(data, page);
    }

    public static ResultModel ok() {
        return new ResultModel(ResultStatusEnum.SUCCEED_CODE_VALUE);
    }

    public static ResultModel error(ResultStatusEnum error) {
        return new ResultModel(error);
    }

}
