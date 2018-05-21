package com.cn.manager.web.filter;


import com.cn.core.db.DatabaseContextHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * 清除数据库选择信息
 */
public class ManagerMultiDbFilter implements Filter {
	private Logger logger = LoggerFactory.getLogger(ManagerMultiDbFilter.class);

	@Override
	public void init(FilterConfig fc) throws ServletException {
		
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain fc) throws IOException, ServletException {
		logger.info("过滤器启动..ManagerMultiDbFilter ... ");
		fc.doFilter(request, response);
		//清除线程变量信息
		DatabaseContextHolder.clearDbName();
	}

	@Override
	public void destroy() {
		
	}

}
