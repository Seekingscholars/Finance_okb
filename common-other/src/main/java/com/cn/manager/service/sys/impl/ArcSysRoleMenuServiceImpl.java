package com.cn.manager.service.sys.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cn.core.mapper.BaseMapper;
import com.cn.core.service.impl.BaseServiceImpl;
import com.cn.manager.mapper.sys.ArcSysRoleMenuMapper;
import com.cn.manager.pojo.sys.ArcSysRoleMenu;
import com.cn.manager.service.sys.ArcSysRoleMenuService;


/**
 * 角色菜单表ServiceImpl
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:49:12
 *
 */
@Service("arcSysRoleMenuService")
public class ArcSysRoleMenuServiceImpl extends BaseServiceImpl<ArcSysRoleMenu, Long> implements ArcSysRoleMenuService {
	
    private static final Logger logger = LoggerFactory.getLogger(ArcSysRoleMenuServiceImpl.class);
   
    @Resource
    private ArcSysRoleMenuMapper arcSysRoleMenuMapper;

	@Override
	public BaseMapper<ArcSysRoleMenu, Long> getMapper() {
		return arcSysRoleMenuMapper;
	}
	
}
