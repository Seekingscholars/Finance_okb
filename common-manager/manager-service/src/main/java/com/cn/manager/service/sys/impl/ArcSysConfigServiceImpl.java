package com.cn.manager.service.sys.impl;

import com.cn.core.mapper.BaseMapper;
import com.cn.core.service.impl.BaseServiceImpl;
import com.cn.manager.mapper.sys.ArcSysConfigMapper;
import com.cn.manager.pojo.sys.ArcSysConfig;
import com.cn.manager.service.sys.ArcSysConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 系统配置表ServiceImpl
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:32:11
 *
 */
@Service("arcSysConfigService")
public class ArcSysConfigServiceImpl extends BaseServiceImpl<ArcSysConfig, Long> implements ArcSysConfigService {
	
    private static final Logger logger = LoggerFactory.getLogger(ArcSysConfigServiceImpl.class);
   
    @Resource
    private ArcSysConfigMapper arcSysConfigMapper;

	@Override
	public BaseMapper<ArcSysConfig, Long> getMapper() {
		return arcSysConfigMapper;
	}
	
}
