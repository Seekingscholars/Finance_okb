package com.cn.utils.token;

import com.cn.utils.model.AuthUserRole;

/**
 * Token管理
 * @author nmnl
 */
public interface TokenBusiness {
	
	/**
	 * 创建token
	 * @param obj
	 * @param userType
	 */
	TokenModel createToken(Object obj,Integer userType);

	/**
	 * 根据key清楚缓存
	 * @param token
	 * @param userType
	 */
	void deleteToken(String token,Integer userType);

	/**
	 * 查询token
	 * @param token
	 * @param userType
	 */
	AuthUserRole queryToken(String token, Integer userType);
}
