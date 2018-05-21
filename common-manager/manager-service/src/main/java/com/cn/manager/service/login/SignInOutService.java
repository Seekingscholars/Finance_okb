package com.cn.manager.service.login;

import com.cn.manager.pojo.sys.ArcSysUser;
import com.cn.utils.exception.CustomException;
import com.cn.utils.token.TokenModel;

/**
 * 登入登出
 * @author nmnl
 *
 */
public interface SignInOutService {
	
	/**
	 * 登入
	 * @return SysUser
	 * @throws CustomException
	 */
	ArcSysUser platformSignIn(String username, String password) throws CustomException;

	/**
	 * 登出
	 */
	void platformSignOut(String token) throws CustomException;

}
