package com.cn.manager.pojo.sys;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色菜单表实体
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:49:12
 *
 */
 public class ArcSysRoleMenu implements Serializable {

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
    * 菜单主键
    */
    private Integer menuId;

    /**
    * 
    */
    private Integer isMenu;


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
    * 获取菜单主键
    *
    * @return 菜单主键
    */
    public Integer getMenuId(){
        return menuId;
    }

    /**
    * 设置菜单主键
    * 
    * @param menuId 要设置的菜单主键
    */
    public void setMenuId(Integer menuId){
        this.menuId = menuId;
    }

    /**
    * 获取
    *
    * @return 
    */
    public Integer getIsMenu(){
        return isMenu;
    }

    /**
    * 设置
    * 
    * @param isMenu 要设置的
    */
    public void setIsMenu(Integer isMenu){
        this.isMenu = isMenu;
    }

}
