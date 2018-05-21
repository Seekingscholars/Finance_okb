package com.cn.manager.pojo.sys;

import java.io.Serializable;

/**
 * 用户角色表实体
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:50:24
 *
 */
 public class ArcSysUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 角色主键
    */
    private Integer roleId;

    /**
    * 用户主键
    */
    private Integer userId;

    /**
    * 级别
    */
    private Integer level;


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
    * 获取角色主键
    *
    * @return 角色主键
    */
    public Integer getRoleId(){
        return roleId;
    }

    /**
    * 设置角色主键
    * 
    * @param roleId 要设置的角色主键
    */
    public void setRoleId(Integer roleId){
        this.roleId = roleId;
    }

    /**
    * 获取用户主键
    *
    * @return 用户主键
    */
    public Integer getUserId(){
        return userId;
    }

    /**
    * 设置用户主键
    * 
    * @param userId 要设置的用户主键
    */
    public void setUserId(Integer userId){
        this.userId = userId;
    }

    /**
    * 获取级别
    *
    * @return 级别
    */
    public Integer getLevel(){
        return level;
    }

    /**
    * 设置级别
    * 
    * @param level 要设置的级别
    */
    public void setLevel(Integer level){
        this.level = level;
    }

}
