package com.cn.manager.service.sys.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cn.core.mapper.BaseMapper;
import com.cn.core.service.impl.BaseServiceImpl;
import com.cn.manager.mapper.sys.ArcSysUserRoleMapper;
import com.cn.manager.pojo.sys.ArcSysUserRole;
import com.cn.manager.service.sys.ArcSysUserRoleService;


/**
 * 用户角色表ServiceImpl
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:50:24
 *
 */
@Service("arcSysUserRoleService")
public class ArcSysUserRoleServiceImpl extends BaseServiceImpl<ArcSysUserRole, Long> implements ArcSysUserRoleService {
	
    private static final Logger logger = LoggerFactory.getLogger(ArcSysUserRoleServiceImpl.class);
   
    @Resource
    private ArcSysUserRoleMapper arcSysUserRoleMapper;

	@Override
	public BaseMapper<ArcSysUserRole, Long> getMapper() {
		return arcSysUserRoleMapper;
	}
	
}
