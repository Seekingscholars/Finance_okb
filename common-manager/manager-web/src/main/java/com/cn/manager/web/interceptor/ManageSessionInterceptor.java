package com.cn.manager.web.interceptor;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

public class ManageSessionInterceptor extends HandlerInterceptorAdapter {

    private Logger logger = LoggerFactory.getLogger(ManageSessionInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("拦截器启动.. ManageSessionInterceptor .. ");
        //获取用户的token
        /*String token = manager.getToken(request);
        if (EStringUtils.isBlank(token)) {
            throw new CustomException(ManagerExceptionEnum.NOCOOKIE_CODE_VALUE);
        }
        AuthUserRole authUserRole = manager.getAuthUserRole(token);
        //获取用户角色异常
        if (null == authUserRole) {
            throw new CustomException(ManageExceptionEnum.NOCOOKIE_CODE_VALUE);
        }
        //获取用户访问的url
        String servletPath = request.getServletPath();

        //强制登出
        try {
            HandlerMethod hm = (HandlerMethod) handler;
            //方法名
            Method method = hm.getMethod();
            //参数
            String parameters = getRequestParameter(request);
            //controller name
            String actionName = hm.getBean().getClass().getName();
            logger.info("登录名: " + authUserRole.getUserName() + " 用户姓名: " + authUserRole.getRealName() + " 角色id: " + authUserRole.getRoleId() + " 角色名称: " + authUserRole.getRoleName());
            logger.info("Java: " + actionName + "." + method.getName() + " 参数为: " + parameters + " url: " + servletPath);
        } catch (Exception ex) {
            throw new CustomException(ManageExceptionEnum.NO_PERMISSION_OTHER_CODE_VALUE);
        }
        //鉴权
        if(!manager.authentication(servletPath,authUserRole.getRoleId(),0l)){
            throw new CustomException(ManageExceptionEnum.NO_PERMISSION_CODE_VALUE);
        }*/
        return true;
    }

    private String getRequestParameter(HttpServletRequest request) {
        StringBuffer sb = new StringBuffer();
        try {
            Enumeration<String> enu = request.getParameterNames();
            while (enu.hasMoreElements()) {
                String paraName = enu.nextElement();
                if (!"_dc".equals(paraName) && !"node".equals(paraName)) {//_dc的参数不要
                    String[] arr = request.getParameterValues(paraName);
                    if (arr != null && arr.length > 0) {
                        sb.append(paraName + "=" + JSONObject.toJSONString(arr));
                    } else {
                        sb.append(paraName + "=" + request.getParameter(paraName) + ";");
                    }
                }
            }
        } catch (Exception e) {
            logger.error(JSONObject.toJSONString(e));
        }
        return sb.toString();
    }

}
