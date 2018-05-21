package com.cn.utils.enums;

/**
 * 
 * @Description :全局异常枚举类
 * @author nmnl
 * @version 1.1
 * @Date 20180403 14:34
 *
 */
public enum CustomExceptionEnum {
	/**1--------------------------------------------------起点-----------------------------------------------------*/
	SUCCEED_CODE_VALUE               				(1000,"接口调用成功"),
	FAIL_CODE_VALUE               					(1001,"接口调用失败"),
	OTHER_CODE_VALUE               					(1002,"接口调用失败"),
	/**2--------------------------------------------------系统级别-----------------------------------------------------*/
	FAIL_CODE_PARAM_INSUFFICIENT	 				(2000,"请求参数异常,请联系开发人员!"),
	FAIL_COMPARE_VERSION	 						(2001,"版本数据错误,请联系开发人员!"),
	/**3--------------------------------------------------用户异常-----------------------------------------------------*/
	FAIL_USER_VALUE	 								(3000,"用户信息异常!"),
	FAIL_USER_STATE	 								(3001,"用户状态异常!"),

	FAIL_FOLLOW_USER_VALUE	 						(3100,"关注用户信息异常!"),
	FAIL_FOLLOW_USER_STATE	 						(3101,"关注用户状态异常!"),
	/**4--------------------------------------------------接口各种异常状态（非系统级异常）----------------------------------*/
	FAIL_APP_VERSION	 							(4000,"APP内置版本需要升级,请联系开发人员!"),
	FAIL_DAY_BETWEEN								(4001,"APP内置版本需要升级,请联系开发人员!"),

	FAIL_RETURN_MAP									(4101,"业务参数返回异常!"),
	/**5--------------------------------------------------其他错误情况,5000-----------------------------------------------------*/

    /**6--------------------------------------------------以6开头-----------------------------------------------------*/

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

	CustomExceptionEnum(Integer errorCode, String errorMsg){
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
	public static CustomExceptionEnum getByCode(Integer errorCode){
		CustomExceptionEnum[] enums = values();
		for(CustomExceptionEnum e:enums){
			if(e.errorCode.equals(errorCode)){
				return e;
			}
		}
 		return null;
	}
	
}

