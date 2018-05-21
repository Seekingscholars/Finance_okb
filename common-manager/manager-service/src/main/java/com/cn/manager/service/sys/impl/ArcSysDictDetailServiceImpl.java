package com.cn.manager.service.sys.impl;

import com.cn.core.mapper.BaseMapper;
import com.cn.core.service.impl.BaseServiceImpl;
import com.cn.manager.mapper.sys.ArcSysDictDetailMapper;
import com.cn.manager.pojo.sys.ArcSysDictDetail;
import com.cn.manager.service.sys.ArcSysDictDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 字典表数据明细ServiceImpl
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:47:30
 *
 */
@Service("arcSysDictDetailService")
public class ArcSysDictDetailServiceImpl extends BaseServiceImpl<ArcSysDictDetail, Long> implements ArcSysDictDetailService {
	
    private static final Logger logger = LoggerFactory.getLogger(ArcSysDictDetailServiceImpl.class);
   
    @Resource
    private ArcSysDictDetailMapper arcSysDictDetailMapper;

	@Override
	public BaseMapper<ArcSysDictDetail, Long> getMapper() {
		return arcSysDictDetailMapper;
	}
	
}
