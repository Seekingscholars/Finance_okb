package com.cn.manager.pojo.sys;

import java.io.Serializable;

/**
 * 字典表数据明细实体
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:47:30
 *
 */
 public class ArcSysDictDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 参数编码
    */
    private String itemCode;

    /**
    * 参数值
    */
    private String itemValue;

    /**
    * 父级ID
    */
    private Integer parentId;

    /**
    * 状态  10 有效 20 无效
    */
    private String state;


    /**
    * 获取主键Id
    *
    * @return id
    */
    public Long getId(){
        return id;
    }

    /**
    * 设置主键Id
    * 
    * @param id
    */
    public void setId(Long id){
        this.id = id;
    }

    /**
    * 获取参数编码
    *
    * @return 参数编码
    */
    public String getItemCode(){
        return itemCode;
    }

    /**
    * 设置参数编码
    * 
    * @param itemCode 要设置的参数编码
    */
    public void setItemCode(String itemCode){
        this.itemCode = itemCode;
    }

    /**
    * 获取参数值
    *
    * @return 参数值
    */
    public String getItemValue(){
        return itemValue;
    }

    /**
    * 设置参数值
    * 
    * @param itemValue 要设置的参数值
    */
    public void setItemValue(String itemValue){
        this.itemValue = itemValue;
    }

    /**
    * 获取父级ID
    *
    * @return 父级ID
    */
    public Integer getParentId(){
        return parentId;
    }

    /**
    * 设置父级ID
    * 
    * @param parentId 要设置的父级ID
    */
    public void setParentId(Integer parentId){
        this.parentId = parentId;
    }

    /**
    * 获取状态  10 有效 20 无效
    *
    * @return 状态  10 有效 20 无效
    */
    public String getState(){
        return state;
    }

    /**
    * 设置状态  10 有效 20 无效
    * 
    * @param state 要设置的状态  10 有效 20 无效
    */
    public void setState(String state){
        this.state = state;
    }

}
