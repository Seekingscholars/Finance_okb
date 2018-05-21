package com.cn.utils.enums;

/**
 * 
 * @Description :manage异常枚举类
 * @author nmnl
 * @version 1.1
 * @Date 20180403 14:34
 *
 */
public enum ApiExceptionEnum {
	/**1--------------------------------------------------起点-----------------------------------------------------*/
	SUCCEED_CODE_VALUE               				(1000,"接口调用成功"),
	FAIL_CODE_VALUE               					(1001,"接口调用失败"),
	OTHER_CODE_VALUE               					(1002,"接口调用失败"),
	/**2--------------------------------------------------系统级别-----------------------------------------------------*/

	/**4--------------------------------------------------接口各种异常状态（非系统级异常），以40开头-----------------------------------------------------*/

	/**5--------------------------------------------------其他错误情况,5000-----------------------------------------------------*/

    /**6--------------------------------------------------用户,以6开头-----------------------------------------------------*/

	/**8--------------------------------------------------Cookie相关 85开头-----------------------------------------------------*/


	/**#--------------------------------------------------业务相关 其他情况待分配-----------------------------------------------------*/

	PARAMETER_CHECKING_CODE			 				(7000,"参数校验不通过 "),
	CLIENT_EXCEPTION_CODE_VALUE		 				(9980,"连接异常（除请求超时）"),
	TIMEOUT_CODE_VALUE		 		 				(9990,"请求超时"),
	;

	/**
	 * 错误码
	 */
	private Integer errorCode;

	/**
	 * 错误信息
	 */
	private String errorMsg;

	ApiExceptionEnum(Integer errorCode, String errorMsg){
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	/** @20170213  根据errorCode 获取enum对象  **/
	public static ApiExceptionEnum getByCode(Integer errorCode){
		ApiExceptionEnum[] enums = values();
		for(ApiExceptionEnum e:enums){
			if(e.errorCode.equals(errorCode)){
				return e;
			}
		}
 		return null;
	}
	
}

