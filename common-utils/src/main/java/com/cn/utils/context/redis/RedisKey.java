package com.cn.utils.context.redis;


import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.TreeMap;

public class RedisKey {

	public static String getTokenKey(String id){
		return REDIS_PREFIX.TokenCache.prefix() + id;
	}

	public static String getManagerTokenKey(String token){
		if (StringUtils.isNotBlank(token)){
			String [] tokens = token.split("@");
			return REDIS_PREFIX.ManagerTokenCache.prefix() + tokens[0];
		}
		return null;
	}

	public static String getManagerHomeInfoByMethodName(String methodName){
		return REDIS_PREFIX.ManagerHomeInfoCache.prefix() + methodName;
	}

	/**
	 * 用户类型.
	 * */
	public enum USER_TYPE{
		SYS_TYPE 									(1,"系统用户"),
		APP_TYPE 									(2,"app用户"),
		H5_TYPE 									(3,"h5用户");

		private Integer EnumKey;
		private String EnumValue;
		USER_TYPE(Integer EnumKey, String EnumValue){
			this.EnumKey = EnumKey;
			this.EnumValue = EnumValue;
		}
		public Integer EnumKey(){
			return EnumKey;
		}

		public String EnumValue(){
			return EnumValue;
		}

		public static Map<Integer,Object> EnumValueS(){
			Map<Integer,Object> outMap = new TreeMap<>();
			USER_TYPE[] enums = values();
			for(USER_TYPE e:enums){
				outMap.put(e.EnumKey,e.EnumValue);
			}
			return outMap;
		}

		public static USER_TYPE getByEnumKey(Integer EnumKey){
			USER_TYPE[] enums = values();
			for(USER_TYPE e:enums){
				if(e.EnumKey.equals(EnumKey)){
					return e;
				}
			}
			return null;
		}
	}

	/**
	 * Redis有效时间.
	 * */
	public enum REDIS_EXPIRE{
		DEFAULT_EXPIRE_SECONDS 									(60*60*24,"健默认持续时间"),
		AUTH_TOKEN_EXPIRE_SECONDS 								(60*60*1 ,"健默认持续时间");

		private Integer EnumKey;
		private String EnumValue;
		REDIS_EXPIRE(Integer EnumKey, String EnumValue){
			this.EnumKey = EnumKey;
			this.EnumValue = EnumValue;
		}
		public Integer EnumKey(){
			return EnumKey;
		}

		public String EnumValue(){
			return EnumValue;
		}

		public static Map<Integer,Object> EnumValueS(){
			Map<Integer,Object> outMap = new TreeMap<>();
			REDIS_EXPIRE[] enums = values();
			for(REDIS_EXPIRE e:enums){
				outMap.put(e.EnumKey,e.EnumValue);
			}
			return outMap;
		}

		public static REDIS_EXPIRE getByEnumKey(Integer EnumKey){
			REDIS_EXPIRE[] enums = values();
			for(REDIS_EXPIRE e:enums){
				if(e.EnumKey.equals(EnumKey)){
					return e;
				}
			}
			return null;
		}
	}

	/**
	 * Redis缓存前缀.
	 * */
	public enum REDIS_PREFIX{
		// "前缀value" "添加对象字段" "描述"
		EntityCache("ENTITY_INSTANCE_","[CLASSNAME]_[ID]","根据对象实例ID存储"),//ENTITY_INSTANCE_EUser_632673243

		TokenCache("USER_TOKEN_","[TokenBusiness]","根据TokenID存储"),//USER_TOKEN_3FD2936E9B64268F07887E53136B2E11:FG

		ManagerTokenCache("MANAGER_USER_TOKEN_","[TokenBusiness]","根据TokenID存储"),//MANAGER_USER_TOKEN_3FD2936E9B64268F07887E53136B2E11:FG

		ManagerMenuByRoleCache("MANAGER_MENU_BY_ROLE_","[RoleId]","根据RoleID存储Menu"),

		ManagerHomeInfoCache("MANAGER_HOMEINFO_","[HOMEINFO]","根据模块存储首页信息"),

		AuthPermitByUrlRole("AUTH_PERMIT_BY_URL_ROLE_","[URL]_[RoleId]","根据URLRoleID存储权限细节"),

		EntityCacheByUser("ENTITY_INSTANCE_BYUSERID_","[CLASSNAME]_[ID]","根据对象实例ID存储"),//ENTITY_INSTANCE_BYUSER_ESellerUser_632673243
		;

		private String prefix;
		private String addition;
		private String describe;

		REDIS_PREFIX(String prefix, String addition, String describe){
			this.prefix = prefix;
			this.addition = addition;
			this.describe = describe;
		}

		public String prefix() {
			return prefix;
		}

		public String addition() {
			return addition;
		}

		public String describe() {
			return describe;
		}
	}
}
