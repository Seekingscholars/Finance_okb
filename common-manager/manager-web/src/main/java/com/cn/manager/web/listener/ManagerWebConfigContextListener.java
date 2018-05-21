package com.cn.manager.web.listener;

import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * 监听器
 * @author nmnl
 * @version 1.0.0
 * @date 2018-04-03 14:13
 */

public class ManagerWebConfigContextListener implements ServletContextListener,HttpSessionAttributeListener {

	private static Logger logger = Logger.getLogger(ManagerWebConfigContextListener.class);
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		logger.info("监听器启动... ManagerWebConfigContextListener ... ");
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		
	}
}
