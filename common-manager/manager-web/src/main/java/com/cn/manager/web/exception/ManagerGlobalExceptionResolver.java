package com.cn.manager.web.exception;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.cn.utils.enums.ManagerExceptionEnum;
import com.cn.utils.exception.CustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Spring全局异常
 *
 * @auther nmnl
 * @date 20180403 14:34
 * @version 1.0.0
 * */
@Component
public class ManagerGlobalExceptionResolver implements HandlerExceptionResolver {

	private static Logger logger = LoggerFactory.getLogger(ManagerGlobalExceptionResolver.class);
	private static String RESPONSE_CODE = "code";
    private static String RESPONSE_CODE_MSG = "message";
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
	    logger.info("异常类启动.. 准备抛出异常.. ");
        Map<String, Object> attributes = new HashMap<>();
        //返回的ModelAndView
		ModelAndView mv = new ModelAndView();
        //使用FastJson提供的FastJsonJsonView视图返回，不需要捕获异常
        FastJsonJsonView view = new FastJsonJsonView();
        if(ex instanceof CustomException){
        	/** manager自定义通用异常   **/
            logger.info("---------异常捕获 ManageLogInException------:"+ ex.getMessage(),ex);
            attributes.put(RESPONSE_CODE,((CustomException) ex).getErrorCode());
            attributes.put(RESPONSE_CODE_MSG, ((CustomException) ex).getErrorMsg());
		}else if(ex instanceof RuntimeException){
            /** 运行时异常  **/
            logger.info("---------异常捕获 RuntimeException------:"+ ex.getMessage(),ex);
            attributes.put(RESPONSE_CODE, ManagerExceptionEnum.FAIL_CODE_VALUE.getErrorCode());
            attributes.put(RESPONSE_CODE_MSG, ManagerExceptionEnum.FAIL_CODE_VALUE.getErrorMsg());
        }else{
			/** 其他系统错误 manager自定义通用异常 **/
            logger.info("---------异常捕获 其他系统异常------"+ ex.getMessage(),ex);
			//抛出系统异常
            attributes.put(RESPONSE_CODE, ManagerExceptionEnum.OTHER_CODE_VALUE.getErrorCode());
            attributes.put(RESPONSE_CODE_MSG, ManagerExceptionEnum.OTHER_CODE_VALUE.getErrorMsg());
		}
        view.setAttributesMap(attributes);
        mv.setView(view);
        return mv;
	}
}
