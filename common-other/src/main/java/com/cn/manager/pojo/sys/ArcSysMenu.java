package com.cn.manager.pojo.sys;

import java.io.Serializable;
import java.util.Date;

/**
 * 菜单表实体
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:48:14
 *
 */
 public class ArcSysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 类型  0公用 1信贷 2车贷
    */
    private Integer sysType;

    /**
    * 菜单名称,按钮名称，控制前台一级页面的按钮名称
    */
    private String name;

    /**
    * 父级ID
    */
    private Integer parentId;

    /**
    * 链接地址
    */
    private String href;

    /**
    * 一级菜单需要配置，对应菜单前的小图标
    */
    private String iconCls;

    /**
    * 排序
    */
    private Integer sort;

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
    * 是否删除 ：0不删除，1删除
    */
    private Integer isDelete;

    /**
    * 是否菜单 0否，1是
    */
    private Integer isMenu;

    /**
    * 资源类型：0.工作台 1.menu（父菜单）,2.url menu（子菜单，点击打开页面，需要配置href），3.查询框内的请求或者按钮
			4.列表后的请求或者按钮 5.tab，7.查询和列表中间的按钮或者请求 8.非一级页面按钮 9.
			其他特殊可自定义
    */
    private Integer menuType;

    /**
    * 按钮动作标识 查询-Query，重置-Reset，导出-Export，新增-Add，删除-Delete，修改/编辑-Edit，详情-Detail，其他特殊的可以单独定义
    */
    private String actionTag;

    /**
    * 请求路径（需要查询下拉条件或者特殊的子菜单和所有的请求需要配置）
    */
    private String limitCode;

    /**
    * 控制器名字
    */
    private String controllerName;

    /**
    * 是否为子节点  1 true 0 false
    */
    private Integer leaf;

    /**
    * 树状层数据
    */
    private Integer level;

    /**
    * 
    */
    private String scriptidOld;


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
    * 获取类型  0公用 1信贷 2车贷
    *
    * @return 类型  0公用 1信贷 2车贷
    */
    public Integer getSysType(){
        return sysType;
    }

    /**
    * 设置类型  0公用 1信贷 2车贷
    * 
    * @param sysType 要设置的类型  0公用 1信贷 2车贷
    */
    public void setSysType(Integer sysType){
        this.sysType = sysType;
    }

    /**
    * 获取菜单名称,按钮名称，控制前台一级页面的按钮名称
    *
    * @return 菜单名称,按钮名称，控制前台一级页面的按钮名称
    */
    public String getName(){
        return name;
    }

    /**
    * 设置菜单名称,按钮名称，控制前台一级页面的按钮名称
    * 
    * @param name 要设置的菜单名称,按钮名称，控制前台一级页面的按钮名称
    */
    public void setName(String name){
        this.name = name;
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
    * 获取链接地址
    *
    * @return 链接地址
    */
    public String getHref(){
        return href;
    }

    /**
    * 设置链接地址
    * 
    * @param href 要设置的链接地址
    */
    public void setHref(String href){
        this.href = href;
    }

    /**
    * 获取一级菜单需要配置，对应菜单前的小图标
    *
    * @return 一级菜单需要配置，对应菜单前的小图标
    */
    public String getIconCls(){
        return iconCls;
    }

    /**
    * 设置一级菜单需要配置，对应菜单前的小图标
    * 
    * @param iconCls 要设置的一级菜单需要配置，对应菜单前的小图标
    */
    public void setIconCls(String iconCls){
        this.iconCls = iconCls;
    }

    /**
    * 获取排序
    *
    * @return 排序
    */
    public Integer getSort(){
        return sort;
    }

    /**
    * 设置排序
    * 
    * @param sort 要设置的排序
    */
    public void setSort(Integer sort){
        this.sort = sort;
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
    * 获取是否删除 ：0不删除，1删除
    *
    * @return 是否删除 ：0不删除，1删除
    */
    public Integer getIsDelete(){
        return isDelete;
    }

    /**
    * 设置是否删除 ：0不删除，1删除
    * 
    * @param isDelete 要设置的是否删除 ：0不删除，1删除
    */
    public void setIsDelete(Integer isDelete){
        this.isDelete = isDelete;
    }

    /**
    * 获取是否菜单 0否，1是
    *
    * @return 是否菜单 0否，1是
    */
    public Integer getIsMenu(){
        return isMenu;
    }

    /**
    * 设置是否菜单 0否，1是
    * 
    * @param isMenu 要设置的是否菜单 0否，1是
    */
    public void setIsMenu(Integer isMenu){
        this.isMenu = isMenu;
    }

    /**
    * 获取资源类型：0.工作台 1.menu（父菜单）,2.url menu（子菜单，点击打开页面，需要配置href），3.查询框内的请求或者按钮
			4.列表后的请求或者按钮 5.tab，7.查询和列表中间的按钮或者请求 8.非一级页面按钮 9.
			其他特殊可自定义
    *
    * @return 资源类型：0.工作台 1.menu（父菜单）,2.url menu（子菜单，点击打开页面，需要配置href），3.查询框内的请求或者按钮
			4.列表后的请求或者按钮 5.tab，7.查询和列表中间的按钮或者请求 8.非一级页面按钮 9.
			其他特殊可自定义
    */
    public Integer getMenuType(){
        return menuType;
    }

    /**
    * 设置资源类型：0.工作台 1.menu（父菜单）,2.url menu（子菜单，点击打开页面，需要配置href），3.查询框内的请求或者按钮
			4.列表后的请求或者按钮 5.tab，7.查询和列表中间的按钮或者请求 8.非一级页面按钮 9.
			其他特殊可自定义
    * 
    * @param menuType 要设置的资源类型：0.工作台 1.menu（父菜单）,2.url menu（子菜单，点击打开页面，需要配置href），3.查询框内的请求或者按钮
			4.列表后的请求或者按钮 5.tab，7.查询和列表中间的按钮或者请求 8.非一级页面按钮 9.
			其他特殊可自定义
    */
    public void setMenuType(Integer menuType){
        this.menuType = menuType;
    }

    /**
    * 获取按钮动作标识 查询-Query，重置-Reset，导出-Export，新增-Add，删除-Delete，修改/编辑-Edit，详情-Detail，其他特殊的可以单独定义
    *
    * @return 按钮动作标识 查询-Query，重置-Reset，导出-Export，新增-Add，删除-Delete，修改/编辑-Edit，详情-Detail，其他特殊的可以单独定义
    */
    public String getActionTag(){
        return actionTag;
    }

    /**
    * 设置按钮动作标识 查询-Query，重置-Reset，导出-Export，新增-Add，删除-Delete，修改/编辑-Edit，详情-Detail，其他特殊的可以单独定义
    * 
    * @param actionTag 要设置的按钮动作标识 查询-Query，重置-Reset，导出-Export，新增-Add，删除-Delete，修改/编辑-Edit，详情-Detail，其他特殊的可以单独定义
    */
    public void setActionTag(String actionTag){
        this.actionTag = actionTag;
    }

    /**
    * 获取请求路径（需要查询下拉条件或者特殊的子菜单和所有的请求需要配置）
    *
    * @return 请求路径（需要查询下拉条件或者特殊的子菜单和所有的请求需要配置）
    */
    public String getLimitCode(){
        return limitCode;
    }

    /**
    * 设置请求路径（需要查询下拉条件或者特殊的子菜单和所有的请求需要配置）
    * 
    * @param limitCode 要设置的请求路径（需要查询下拉条件或者特殊的子菜单和所有的请求需要配置）
    */
    public void setLimitCode(String limitCode){
        this.limitCode = limitCode;
    }

    /**
    * 获取控制器名字
    *
    * @return 控制器名字
    */
    public String getControllerName(){
        return controllerName;
    }

    /**
    * 设置控制器名字
    * 
    * @param controllerName 要设置的控制器名字
    */
    public void setControllerName(String controllerName){
        this.controllerName = controllerName;
    }

    /**
    * 获取是否为子节点  1 true 0 false
    *
    * @return 是否为子节点  1 true 0 false
    */
    public Integer getLeaf(){
        return leaf;
    }

    /**
    * 设置是否为子节点  1 true 0 false
    * 
    * @param leaf 要设置的是否为子节点  1 true 0 false
    */
    public void setLeaf(Integer leaf){
        this.leaf = leaf;
    }

    /**
    * 获取树状层数据
    *
    * @return 树状层数据
    */
    public Integer getLevel(){
        return level;
    }

    /**
    * 设置树状层数据
    * 
    * @param level 要设置的树状层数据
    */
    public void setLevel(Integer level){
        this.level = level;
    }

    /**
    * 获取
    *
    * @return 
    */
    public String getScriptidOld(){
        return scriptidOld;
    }

    /**
    * 设置
    * 
    * @param scriptidOld 要设置的
    */
    public void setScriptidOld(String scriptidOld){
        this.scriptidOld = scriptidOld;
    }

}
