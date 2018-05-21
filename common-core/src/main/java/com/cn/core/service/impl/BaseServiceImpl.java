package com.cn.core.service.impl;

import com.cn.core.mapper.BaseMapper;
import com.cn.core.service.BaseService;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * 基类接口抽象
 * @author nmnl
 * @version 1.0
 * @data 20180403 19:20
 */

public abstract class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {
	
	@Resource
	private BaseMapper<T, ID> baseMapper;
	
	@Override
	public int save(T record) {
		return getMapper().save(record);
	}

	@Override
	public T getById(ID id) {
		return getMapper().findByPrimary(id);
	}

	@Override
	public int updateById(T record) {
		return getMapper().updateSelective(record);
	}

	public abstract BaseMapper<T, ID> getMapper();

}
