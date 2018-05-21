package com.cn.manager.service.sys.impl;

import com.cn.core.mapper.BaseMapper;
import com.cn.core.service.impl.BaseServiceImpl;
import com.cn.manager.mapper.sys.ArcSysRoleMapper;
import com.cn.manager.pojo.sys.ArcSysRole;
import com.cn.manager.service.sys.ArcSysRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 角色表ServiceImpl
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:48:38
 *
 */
@Service("arcSysRoleService")
public class ArcSysRoleServiceImpl extends BaseServiceImpl<ArcSysRole, Long> implements ArcSysRoleService {
	
    private static final Logger logger = LoggerFactory.getLogger(ArcSysRoleServiceImpl.class);
   
    @Resource
    private ArcSysRoleMapper arcSysRoleMapper;

	@Override
	public BaseMapper<ArcSysRole, Long> getMapper() {
		return arcSysRoleMapper;
	}
	
}
