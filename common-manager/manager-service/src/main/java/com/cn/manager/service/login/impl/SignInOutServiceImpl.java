package com.cn.manager.service.login.impl;

import com.cn.manager.mapper.sys.ArcSysUserMapper;
import com.cn.manager.pojo.sys.ArcSysUser;
import com.cn.manager.service.login.SignInOutService;
import com.cn.utils.context.redis.RedisKey;
import com.cn.utils.enums.ManagerExceptionEnum;
import com.cn.utils.enums.manager.UserEnum;
import com.cn.utils.exception.CustomException;
import com.cn.utils.password.MD5;
import com.cn.utils.token.TokenBusiness;
import org.omg.PortableInterceptor.INACTIVE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service("signInOutServiceImpl")
public class SignInOutServiceImpl implements SignInOutService {

	private Logger logger = LoggerFactory.getLogger(getClass());

	/*@Autowired
	private SysUserMapper sysUserMapper;
	@Resource
	private SysRoleMapper sysRoleMapper;
	@Autowired
	TokenBusiness manager;*/

	@Autowired
	private ArcSysUserMapper arcSysUserMapper;

	private TokenBusiness tokenBusiness;

	/**
	 * 登录:平台用户 (管理员类型)
	 * @author nmnl
	 */
	@Override
	public ArcSysUser platformSignIn(String username, String password) throws CustomException {
		logger.info("用户登录身份验证:{}->{}", username,password);
		Map<String,Object> params = new HashMap<>();
		params.put("username",username);
		ArcSysUser arcSysUser = arcSysUserMapper.findSelective(params);
		if (null != arcSysUser) {
			//用户状态必须为正常
			//这里用compareTo. 是为了防止缓存溢出,也为了防止数据串改.
			if (UserEnum.USER_STATE.VALID.EnumKey().compareTo(arcSysUser.getStatus()) == 0) {
				String addTime = String.valueOf(arcSysUser.getAddTime().getTime());
				String loginPassword = MD5.encode(addTime + password);
				//校验用户密码
				String pw = arcSysUser.getPassword();
				if (pw.equals(loginPassword)) {
					//校验token. 并且验证token
					//并且存储token
					return arcSysUser;
				}
				//提示用户名或密码错误 密码错误的情况
				throw new CustomException(ManagerExceptionEnum.LOGIN_ERROR_PASSWORD_ERROR_CODE_VALUE);
			}
			//提示用户停用的情况
            throw new CustomException(ManagerExceptionEnum.LOGIN_ERROR_USER_LOCKED_CODE_VALUE);
		}
		// 没找到帐号
        throw new CustomException(ManagerExceptionEnum.LOGIN_ERROR_NO_COUNT_CODE_VALUE);
	}

	/**
	 * 登录:平台用户 (管理员类型)
	 * @author nmnl
	 */
	@Override
	public void platformSignOut(String token) {
		Integer userType = RedisKey.USER_TYPE.SYS_TYPE.EnumKey();
		logger.info("用户登录身份验证:token-> {} , userType-> {}", token,userType);
		tokenBusiness.deleteToken(token,userType);
	}


}