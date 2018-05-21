## 项目名称[现金贷]

## 借鉴项目
* ali项目 [https://github.com/williamHappy/tao-shopping-mall]
* 项目架构简介 [https://blog.csdn.net/williamhappy/article/details/54376855]

## 项目架构说明
* common-parent为所有项目的父项目，主要用来管理所有项目使用的jar包及其版本
* common-utils为公共的工具类项目，继承父项目，它会被打成jar包供其它项目使用。
* common-other为辅佐工具类.用于半自动化/自动化测试以及代码生成器
* common-core放置基础类.方便后期调整.以及父类处理
* common-manager为后端管理服务

## 项目manager 提供管理服务
* manager-pojo为我们自己项目的一个子模块，依赖与manager,打成jar包
* manager-mapper为我们自己项目的一个子模块，依赖与manager-pojo,打成jar包
* manager-service为我们自己项目的一个子模块，依赖与manager-mapper,打成jar包
* manager-web为我们自己项目的一个子模块，依赖与manager-service,打成war包


## 部署环境准备工作
* utils 必须maven install
* parent 必须maven install
* core 必须maven install

## 部署环境前提
* j2ee 1.7
* spring mvc 4.0
* mybatis 
* maven 3.0.9
* tomcat 7
* mysql 5.9
* git

## 部署开发环境
1. 下载 idea 社区版本
2. 打开 idea ,导入[现金贷项目] 本地导入. File -> Open
4. 通过git导入：
5. 需要等待 idea 自动下载jar包
6. 执行 /sql/install.sql 数据库

## [现金贷项目]的功能 [beta1.0 -> 英文版]
*. app 英文版
*. api app服务.
*. manager 后端管理服务
    1. 信审
    2. 财务
    3. 风控
    4. 催收
    5. 访客
    6. 系统

## 首页报表
* 报表信息等等.


## 信审 [外部使用/内部使用]
*.

## 催收 [外部使用/内部使用]
*.

## 财务 [内部使用]
*.

## 风控 [内部使用]
*.

## 访客/系统 [外部使用/内部使用]
*.

## 演示地址
测试环境搭建中...

## 技术关键词
* Java
* Maven
* Spring
* Spring MVC
* MyBatis
* MySQL
* FreeMarker

## 需求