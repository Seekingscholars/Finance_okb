package com.cn.manager.pojo.sys;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色表实体
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:48:38
 *
 */
 public class ArcSysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 角色名
    */
    private String name;

    /**
    * 角色唯一标示
    */
    private String nid;

    /**
    * 添加时间
    */
    private Date addTime;

    /**
    * 添加者
    */
    private String addUser;

    /**
    * 修改时间
    */
    private Date updateTime;

    /**
    * 修改者
    */
    private String updateUser;

    /**
    * 备注
    */
    private String remark;

    /**
    * 是否删除：0不删除，1删除
    */
    private Integer isDelete;


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
    * 获取角色名
    *
    * @return 角色名
    */
    public String getName(){
        return name;
    }

    /**
    * 设置角色名
    * 
    * @param name 要设置的角色名
    */
    public void setName(String name){
        this.name = name;
    }

    /**
    * 获取角色唯一标示
    *
    * @return 角色唯一标示
    */
    public String getNid(){
        return nid;
    }

    /**
    * 设置角色唯一标示
    * 
    * @param nid 要设置的角色唯一标示
    */
    public void setNid(String nid){
        this.nid = nid;
    }

    /**
    * 获取添加时间
    *
    * @return 添加时间
    */
    public Date getAddTime(){
        return addTime;
    }

    /**
    * 设置添加时间
    * 
    * @param addTime 要设置的添加时间
    */
    public void setAddTime(Date addTime){
        this.addTime = addTime;
    }

    /**
    * 获取添加者
    *
    * @return 添加者
    */
    public String getAddUser(){
        return addUser;
    }

    /**
    * 设置添加者
    * 
    * @param addUser 要设置的添加者
    */
    public void setAddUser(String addUser){
        this.addUser = addUser;
    }

    /**
    * 获取修改时间
    *
    * @return 修改时间
    */
    public Date getUpdateTime(){
        return updateTime;
    }

    /**
    * 设置修改时间
    * 
    * @param updateTime 要设置的修改时间
    */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

    /**
    * 获取修改者
    *
    * @return 修改者
    */
    public String getUpdateUser(){
        return updateUser;
    }

    /**
    * 设置修改者
    * 
    * @param updateUser 要设置的修改者
    */
    public void setUpdateUser(String updateUser){
        this.updateUser = updateUser;
    }

    /**
    * 获取备注
    *
    * @return 备注
    */
    public String getRemark(){
        return remark;
    }

    /**
    * 设置备注
    * 
    * @param remark 要设置的备注
    */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
    * 获取是否删除：0不删除，1删除
    *
    * @return 是否删除：0不删除，1删除
    */
    public Integer getIsDelete(){
        return isDelete;
    }

    /**
    * 设置是否删除：0不删除，1删除
    * 
    * @param isDelete 要设置的是否删除：0不删除，1删除
    */
    public void setIsDelete(Integer isDelete){
        this.isDelete = isDelete;
    }

}
