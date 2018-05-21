package com.cn.manager.service.sys.impl;

import com.cn.core.mapper.BaseMapper;
import com.cn.core.service.impl.BaseServiceImpl;
import com.cn.manager.mapper.sys.ArcSysDictMapper;
import com.cn.manager.pojo.sys.ArcSysDict;
import com.cn.manager.service.sys.ArcSysDictService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 数据字典表ServiceImpl
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:46:52
 *
 */
@Service("arcSysDictService")
public class ArcSysDictServiceImpl extends BaseServiceImpl<ArcSysDict, Long> implements ArcSysDictService {
	
    private static final Logger logger = LoggerFactory.getLogger(ArcSysDictServiceImpl.class);
   
    @Resource
    private ArcSysDictMapper arcSysDictMapper;

	@Override
	public BaseMapper<ArcSysDict, Long> getMapper() {
		return arcSysDictMapper;
	}
	
}
