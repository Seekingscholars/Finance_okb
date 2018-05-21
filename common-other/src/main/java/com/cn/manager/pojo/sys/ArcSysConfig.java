package com.cn.manager.pojo.sys;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统配置表实体
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:32:11
 *
 */
 public class ArcSysConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 类型
    */
    private Integer type;

    /**
    * 参数名称
    */
    private String name;

    /**
    * 编号
    */
    private String code;

    /**
    * 参数对应的值
    */
    private String value;

    /**
    * 状态  0不启用  1启用
    */
    private Integer status;

    /**
    * 备注说明
    */
    private String remark;

    /**
    * 创建者
    */
    private Integer creator;


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
    * 获取类型
    *
    * @return 类型
    */
    public Integer getType(){
        return type;
    }

    /**
    * 设置类型
    * 
    * @param type 要设置的类型
    */
    public void setType(Integer type){
        this.type = type;
    }

    /**
    * 获取参数名称
    *
    * @return 参数名称
    */
    public String getName(){
        return name;
    }

    /**
    * 设置参数名称
    * 
    * @param name 要设置的参数名称
    */
    public void setName(String name){
        this.name = name;
    }

    /**
    * 获取编号
    *
    * @return 编号
    */
    public String getCode(){
        return code;
    }

    /**
    * 设置编号
    * 
    * @param code 要设置的编号
    */
    public void setCode(String code){
        this.code = code;
    }

    /**
    * 获取参数对应的值
    *
    * @return 参数对应的值
    */
    public String getValue(){
        return value;
    }

    /**
    * 设置参数对应的值
    * 
    * @param value 要设置的参数对应的值
    */
    public void setValue(String value){
        this.value = value;
    }

    /**
    * 获取状态  0不启用  1启用
    *
    * @return 状态  0不启用  1启用
    */
    public Integer getStatus(){
        return status;
    }

    /**
    * 设置状态  0不启用  1启用
    * 
    * @param status 要设置的状态  0不启用  1启用
    */
    public void setStatus(Integer status){
        this.status = status;
    }

    /**
    * 获取备注说明
    *
    * @return 备注说明
    */
    public String getRemark(){
        return remark;
    }

    /**
    * 设置备注说明
    * 
    * @param remark 要设置的备注说明
    */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
    * 获取创建者
    *
    * @return 创建者
    */
    public Integer getCreator(){
        return creator;
    }

    /**
    * 设置创建者
    * 
    * @param creator 要设置的创建者
    */
    public void setCreator(Integer creator){
        this.creator = creator;
    }

}
