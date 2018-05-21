package com.cn.utils.enums;

/**
 * 
 * @Description :manage异常枚举类
 * @author nmnl
 * @version 1.1
 * @Date 20180403 14:34
 *
 */
public enum ManagerExceptionEnum{
	/**1--------------------------------------------------起点-----------------------------------------------------*/
	SUCCEED_CODE_VALUE               				(1000,"接口调用成功"),
	FAIL_CODE_VALUE               					(1001,"接口调用失败"),
	OTHER_CODE_VALUE               					(1002,"接口调用失败"),
	/**2--------------------------------------------------系统级别-----------------------------------------------------*/

	/**4--------------------------------------------------接口各种异常状态（非系统级异常），以40开头-----------------------------------------------------*/

	/**5--------------------------------------------------其他错误情况,5000-----------------------------------------------------*/

    /**6--------------------------------------------------用户,以6开头-----------------------------------------------------*/
	NO_PERMISSION_CODE_VALUE         				(6000,"您没有访问权限,请联系管理员!"),
	NO_PERMISSION_OTHER_CODE_VALUE         			(6001,"系统异常,请联系管理员!"),
	LOGIN_ERROR_PASSWORD_ERROR_CODE_VALUE			(6501,"密码错误，请核对后输入!"),
	LOGIN_ERROR_USER_LOCKED_CODE_VALUE			 	(6502,"该用户已被停用，请联系管理员!"),
	LOGIN_ERROR_CODE_VALUE			 				(6503,"登录失败,请联系管理员"),
	LOGIN_ERROR_NO_COUNT_CODE_VALUE			 		(6504,"未找到账号,请核对后输入"),
	LOGIN_ERROR_NO_ROLE_CODE_VALUE			 		(6505,"未找到该账号对应的角色"),
	LOGIN_CONFIRM_RELOGIN_CODE_VALUE			 	(6520,"该用户已经登录，是否确认登录？"),
	MODIFY_PASSWORD_OLD_ERROR_CODE_VALUE			(6601,"原密码输入不正确！"),
	MODIFY_PASSWORD_COMPARE_DIFFERENT_CODE_VALUE	(6602,"两个新密码不一致！"),
	MODIFY_PASSWORD_CANT_SAME_CODE_VALUE			(6603,"新密码不能和旧密码相同！"),
	MODIFY_PASSWORD_SYSTEM_LENGTH					(6604,"管理员帐号密码必须在12-24位之间！"),
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

	ManagerExceptionEnum(Integer errorCode, String errorMsg){
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
	public static ManagerExceptionEnum getByCode(Integer errorCode){
		ManagerExceptionEnum[] enums = values();
		for(ManagerExceptionEnum e:enums){
			if(e.errorCode.equals(errorCode)){
				return e;
			}
		}
 		return null;
	}
	
}

