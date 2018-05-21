package com.cn.core.db;


/**
 * @ClassName: DatabaseContextHolder
 * @Description: 多数据源选择器
 * @author nmnl
 * @date 20180403 19:19
 */ 
public class DatabaseContextHolder {
	
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	/** 写数据库 */
	public static final String WRITE_DB = "writeDataSource";

	/** 读数据库 */
	public static final String READ_DB = "readDataSource";

	public static void setDbName(String dbName) {
		contextHolder.set(dbName);
	}

	public static String getDbName() {
		return contextHolder.get();
	}

	public static void clearDbName() {
		contextHolder.remove();
	}
}
