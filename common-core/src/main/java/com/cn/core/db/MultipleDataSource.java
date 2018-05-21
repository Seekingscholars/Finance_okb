package com.cn.core.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @ClassName: MultipleDataSource
 * @Description: 多数据源路由	
 * @author nmnl
 * @date 20180403 19:19
 */ 
public class MultipleDataSource extends AbstractRoutingDataSource{
	
	@Override
	protected Object determineCurrentLookupKey() {
		
		return DatabaseContextHolder.getDbName();
	}

}
