# 项目名称[maven poject]

# 借鉴项目
* ali项目 [https://github.com/williamHappy/tao-shopping-mall]
* 项目架构简介 [https://blog.csdn.net/williamhappy/article/details/54376855]

# 项目架构说明
* common-parent为所有项目的父项目，主要用来管理所有项目使用的jar包及其版本
* common-utils为公共的工具类项目，继承父项目，它会被打成jar包供其它项目使用。
* common-other为辅佐工具类.用于半自动化/自动化测试以及代码生成器
* common-core放置基础类.方便后期调整.以及父类处理
* common-manager为后台管理，继承与我们的父项目
* common-api为app服务，继承与我们的父项目
* common-wechat为微信服务，继承与我们的父项目

# 项目manager 提供服务给予管理员
* manager-pojo为我们自己项目的一个子模块，依赖与manager,打成jar包 
* manager-mapper为我们自己项目的一个子模块，依赖与manager-pojo,打成jar包
* manager-service为我们自己项目的一个子模块，依赖与manager-mapper,打成jar包
* manager-web为我们自己项目的一个子模块，依赖与manager-service,打成war包

# 项目api 提供服务给予app
* api-pojo为我们自己项目的一个子模块，依赖与api,打成jar包 
* api-mapper为我们自己项目的一个子模块，依赖与api-pojo,打成jar包
* api-service为我们自己项目的一个子模块，依赖与api-mapper,打成jar包
* api-web为我们自己项目的一个子模块，依赖与api-service,打成war包

# 项目wechat 提供微信服务
* wechat-pojo为我们自己项目的一个子模块，依赖与wechat,打成jar包
* wechat-mapper为我们自己项目的一个子模块，依赖与wechat-pojo,打成jar包
* wechat-service为我们自己项目的一个子模块，依赖与wechat-mapper,打成jar包
* wechat-web为我们自己项目的一个子模块，依赖与wechat-service,打成war包

## 部署环境准备工作
* utils 必须maven install
* parent 必须maven install
* core 必须maven install

## 部署环境前提
* j2ee 1.7
* spring mvc 4.0
* mybatis 3.4
* maven 3.0.9
* tomcat 7
* mysql 5.9
* gitlab / github

## 部署开发环境
1. 下载 idea 社区版本
2. 打开 idea ,导入[project] 本地导入. File -> Open
4. 通过git导入/github down
5. 需要等待 idea 自动下载jar包

## 演示地址
测试环境搭建中...

## 技术关键词
* jQuery
* Bootstrap
* Java
* Maven
* Spring
* Spring MVC
* MyBatis
* MySQL
* FreeMarker
* H5