package com.cn.manager.service.sys.impl;

import com.cn.core.mapper.BaseMapper;
import com.cn.core.service.impl.BaseServiceImpl;
import com.cn.manager.mapper.sys.ArcSysMenuMapper;
import com.cn.manager.pojo.sys.ArcSysMenu;
import com.cn.manager.service.sys.ArcSysMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 菜单表ServiceImpl
 * 
 * @author nmnl
 * @version 1.0.0
 * @date 2018-05-16 15:48:14
 *
 */
@Service("arcSysMenuService")
public class ArcSysMenuServiceImpl extends BaseServiceImpl<ArcSysMenu, Long> implements ArcSysMenuService {
	
    private static final Logger logger = LoggerFactory.getLogger(ArcSysMenuServiceImpl.class);
   
    @Resource
    private ArcSysMenuMapper arcSysMenuMapper;

	@Override
	public BaseMapper<ArcSysMenu, Long> getMapper() {
		return arcSysMenuMapper;
	}
	
}
