package com.cn.utils.token.impl;

import com.cn.utils.context.redis.RedisCacheUtil;
import com.cn.utils.context.redis.RedisKey;
import com.cn.utils.model.AuthUserRole;
import com.cn.utils.password.MD5;
import com.cn.utils.token.TokenBusiness;
import com.cn.utils.token.TokenModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("tokenBusinessRedis")
public class TokenBusinessRedisImpl implements TokenBusiness {

    @Autowired
    private RedisCacheUtil cacheUtil;

    /**
     * 创建token
     * @author nmnl
     */
    @Override
    public TokenModel createToken(Object obj,Integer userType) {
        TokenModel model = null;
        if (RedisKey.USER_TYPE.SYS_TYPE.EnumKey().compareTo(userType) == 0){
            AuthUserRole authUserRole = (AuthUserRole) obj;
            if (null != authUserRole) {
                String millis = String.valueOf(System.currentTimeMillis());
                String userIdStr = String.valueOf(authUserRole.getUserId());
                //只是为了混淆token有多长.多乱.
                String token = userIdStr + "@" + millis + "#" + authUserRole.getRoleId();
                //写在cookie
                model = new TokenModel(userIdStr, authUserRole.getUserName(), token, MD5.encode(millis));
                cacheUtil.setExpire(RedisKey.getManagerTokenKey(token), authUserRole, RedisKey.REDIS_EXPIRE.AUTH_TOKEN_EXPIRE_SECONDS.EnumKey());
            }
        }
        return model;
    }

    @Override
    public void deleteToken(String token,Integer userType) {
        if (RedisKey.USER_TYPE.SYS_TYPE.EnumKey().compareTo(userType) == 0){
            cacheUtil.del(RedisKey.getManagerTokenKey(token));
        }
    }

    @Override
    public AuthUserRole queryToken(String token,Integer userType) {
        AuthUserRole authUserRole = null;
        if (RedisKey.USER_TYPE.SYS_TYPE.EnumKey().compareTo(userType) == 0){
            authUserRole = cacheUtil.get(RedisKey.getManagerTokenKey(token), AuthUserRole.class);
        }
        return authUserRole;
    }
}
