package com.cn.utils.exception;


import com.cn.utils.enums.ApiExceptionEnum;
import com.cn.utils.enums.CustomExceptionEnum;
import com.cn.utils.enums.ManagerExceptionEnum;

/**
 * @auther nmnl
 * @dsscription Manage用户登录异常
 * @Date 20180403 14:34
 * @version 1.0.0
 * */
public class CustomException extends Exception{

	private static final long serialVersionUID = 9051275901320933959L;
	/**
	 * 错误码
	 */
	private int errorCode;

	@Deprecated
	public CustomException() {
		super();
	}

	/**
	 * 通用异常.
	 */
	public CustomException(CustomExceptionEnum en) {
		super(en.getErrorMsg());
		this.errorCode = en.getErrorCode();
	}

	/**
	 * api异常.
	 */
	public CustomException(ApiExceptionEnum en) {
		super(en.getErrorMsg());
		this.errorCode = en.getErrorCode();
	}

	/**
	 * manager异常.
	 */
	public CustomException(ManagerExceptionEnum en) {
		super(en.getErrorMsg());
		this.errorCode = en.getErrorCode();
	}

	/**
	 * 获取错误码
	 * */
	public int getErrorCode() {
		return errorCode;
	}
	/**
	 * 设置错误码
	 * */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * 获取错误信息
	 * */
	public String getErrorMsg() {
		return getMessage();
	}
}
