package com.cn.core.mapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * 基类mapper
 * @author nmnl
 * @version 1.0
 * @data 20180403 19:20
 */

@RDBatisDao
public interface BaseMapper<T, ID extends Serializable> {

	/**
	 * 插入数据
	 * 
	 * @param e
	 *            实体类
	 * @return 主键值
	 */
	int save(T e);

	/**
	 * 更新数据
	 *            新数据
	 * @param e
	 *            更新条件
	 */
	int updateSelective(T e);

	/**
	 * 获取一条记录
	 * 
	 * @param paramMap
	 *            查询条件
	 * @return 查询结果
	 */
	T findSelective(Map<String, Object> paramMap);

	/**
	 * 根据主键查询数据
	 * 
	 * @param primary
	 *            主键值
	 * @return 数据结果
	 */
	T findByPrimary(ID primary);
	
	/**
	 * 数据查询
	 * 
	 * @param paramMap
	 *            查询条件
	 * @return 结果集
	 */
	List<T> listSelective(Map<String, Object> paramMap);
	
}