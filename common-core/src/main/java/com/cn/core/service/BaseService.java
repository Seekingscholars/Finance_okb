package com.cn.core.service;

import java.io.Serializable;


/**
 * 基类接口定义
 * @author nmnl
 * @version 1.0
 * @data 20180403 19:20
 */

public interface BaseService<T, ID extends Serializable> {

	int save(T record);


	int updateById(T record);
	
	
	T getById(ID id);
	

}
