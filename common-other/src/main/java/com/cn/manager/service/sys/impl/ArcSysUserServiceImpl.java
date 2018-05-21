package com.cn.manager.service.sys.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cn.core.mapper.BaseMapper;
import com.cn.core.service.impl.BaseServiceImpl;
import com.cn.manager.mapper.sys.ArcSysUserMapper;
import com.cn.manager.pojo.sys.ArcSysUser;
import com.cn.manager.service.sys.ArcSysUserService;


/**
 * 系统用户表ServiceImpl
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:49:56
 *
 */
@Service("arcSysUserService")
public class ArcSysUserServiceImpl extends BaseServiceImpl<ArcSysUser, Long> implements ArcSysUserService {
	
    private static final Logger logger = LoggerFactory.getLogger(ArcSysUserServiceImpl.class);
   
    @Resource
    private ArcSysUserMapper arcSysUserMapper;

	@Override
	public BaseMapper<ArcSysUser, Long> getMapper() {
		return arcSysUserMapper;
	}
	
}
