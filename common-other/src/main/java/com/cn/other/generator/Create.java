package com.cn.other.generator;


import com.cn.other.utils.MybatisGenerate;

public class Create {

	public static void main(String[] args) {
		Create ot=new Create();
		ot.createFile();
	}
	
	public void createFile(){

		// 数据库连接信息
		String url = "jdbc:mysql://127.0.0.1:3306/xiaoedai_online_91?rewriteBatchedStatements=true&useUnicode=true&characterEncoding=utf8&autoReconnect=true&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true";
		String MysqlUser = "root";
		String mysqlPassword = "lixin@1234";
		
		// 数据库及数据表名称
		String database = "xiaoedai_online_91";
		String table = "arc_sys_user_role";
		
		// 配置作者及pojo说明
		String classAuthor = "nmnl";
		String functionName = "用户角色表";
 
		// 公共包路径 (例如 BaseDao、 BaseService、 BaseServiceImpl)
		String commonName ="com.cn.core";

		//实体类路径pojo
		String packageName ="com.cn.manager.pojo.sys";
		//空值.数据填充
		String moduleName = "";

		//service文件生产地址
		String serviceName = "com.cn.manager.service.sys";

		//Mapper文件存储地址  默认在resources中
		//@remarks:  调整mapper.xml , mapper.java 位置 符合当前项目 . @date: 20180406 @author: nmnl
		String mapperName = "com.cn.manager.mapper.sys";

		//db属性
		String db="mysql";
		
		//类名前缀
		String classNamePrefix = "arcSysUserRole";

		try {
			MybatisGenerate.generateCode(db,url, MysqlUser, mysqlPassword, database, table,commonName,packageName,mapperName,moduleName,classAuthor,functionName,classNamePrefix,serviceName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
