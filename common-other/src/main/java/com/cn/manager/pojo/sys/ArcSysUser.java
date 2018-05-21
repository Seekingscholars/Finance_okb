package com.cn.manager.pojo.sys;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户表实体
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:49:56
 *
 */
 public class ArcSysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 姓名
    */
    private String name;

    /**
    * 登陆名
    */
    private String userName;

    /**
    * 密码
    */
    private String password;

    /**
    * 工号
    */
    private String jobNum;

    /**
    * 公司
    */
    private String companyId;

    /**
    * 部门
    */
    private String officeId;

    /**
    * 管辖机构
    */
    private String officeOver;

    /**
    * 职位 0普通职员 1主管  2部门经理
    */
    private Integer position;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 电话
    */
    private String phone;

    /**
    * 手机
    */
    private String mobile;

    /**
    * 状态：0正常 1禁用
    */
    private Integer status;

    /**
    * 最后登陆IP
    */
    private String loginIp;

    /**
    * 最后登陆时间
    */
    private Date loginTime;

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
    * 获取姓名
    *
    * @return 姓名
    */
    public String getName(){
        return name;
    }

    /**
    * 设置姓名
    * 
    * @param name 要设置的姓名
    */
    public void setName(String name){
        this.name = name;
    }

    /**
    * 获取登陆名
    *
    * @return 登陆名
    */
    public String getUserName(){
        return userName;
    }

    /**
    * 设置登陆名
    * 
    * @param userName 要设置的登陆名
    */
    public void setUserName(String userName){
        this.userName = userName;
    }

    /**
    * 获取密码
    *
    * @return 密码
    */
    public String getPassword(){
        return password;
    }

    /**
    * 设置密码
    * 
    * @param password 要设置的密码
    */
    public void setPassword(String password){
        this.password = password;
    }

    /**
    * 获取工号
    *
    * @return 工号
    */
    public String getJobNum(){
        return jobNum;
    }

    /**
    * 设置工号
    * 
    * @param jobNum 要设置的工号
    */
    public void setJobNum(String jobNum){
        this.jobNum = jobNum;
    }

    /**
    * 获取公司
    *
    * @return 公司
    */
    public String getCompanyId(){
        return companyId;
    }

    /**
    * 设置公司
    * 
    * @param companyId 要设置的公司
    */
    public void setCompanyId(String companyId){
        this.companyId = companyId;
    }

    /**
    * 获取部门
    *
    * @return 部门
    */
    public String getOfficeId(){
        return officeId;
    }

    /**
    * 设置部门
    * 
    * @param officeId 要设置的部门
    */
    public void setOfficeId(String officeId){
        this.officeId = officeId;
    }

    /**
    * 获取管辖机构
    *
    * @return 管辖机构
    */
    public String getOfficeOver(){
        return officeOver;
    }

    /**
    * 设置管辖机构
    * 
    * @param officeOver 要设置的管辖机构
    */
    public void setOfficeOver(String officeOver){
        this.officeOver = officeOver;
    }

    /**
    * 获取职位 0普通职员 1主管  2部门经理
    *
    * @return 职位 0普通职员 1主管  2部门经理
    */
    public Integer getPosition(){
        return position;
    }

    /**
    * 设置职位 0普通职员 1主管  2部门经理
    * 
    * @param position 要设置的职位 0普通职员 1主管  2部门经理
    */
    public void setPosition(Integer position){
        this.position = position;
    }

    /**
    * 获取邮箱
    *
    * @return 邮箱
    */
    public String getEmail(){
        return email;
    }

    /**
    * 设置邮箱
    * 
    * @param email 要设置的邮箱
    */
    public void setEmail(String email){
        this.email = email;
    }

    /**
    * 获取电话
    *
    * @return 电话
    */
    public String getPhone(){
        return phone;
    }

    /**
    * 设置电话
    * 
    * @param phone 要设置的电话
    */
    public void setPhone(String phone){
        this.phone = phone;
    }

    /**
    * 获取手机
    *
    * @return 手机
    */
    public String getMobile(){
        return mobile;
    }

    /**
    * 设置手机
    * 
    * @param mobile 要设置的手机
    */
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    /**
    * 获取状态：0正常 1禁用
    *
    * @return 状态：0正常 1禁用
    */
    public Integer getStatus(){
        return status;
    }

    /**
    * 设置状态：0正常 1禁用
    * 
    * @param status 要设置的状态：0正常 1禁用
    */
    public void setStatus(Integer status){
        this.status = status;
    }

    /**
    * 获取最后登陆IP
    *
    * @return 最后登陆IP
    */
    public String getLoginIp(){
        return loginIp;
    }

    /**
    * 设置最后登陆IP
    * 
    * @param loginIp 要设置的最后登陆IP
    */
    public void setLoginIp(String loginIp){
        this.loginIp = loginIp;
    }

    /**
    * 获取最后登陆时间
    *
    * @return 最后登陆时间
    */
    public Date getLoginTime(){
        return loginTime;
    }

    /**
    * 设置最后登陆时间
    * 
    * @param loginTime 要设置的最后登陆时间
    */
    public void setLoginTime(Date loginTime){
        this.loginTime = loginTime;
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

}
