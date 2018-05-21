package com.cn.utils.enums.manager;

import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @Description :用户各种枚举
 * @author nmnl
 * @version 1.0
 * @Date 2018-04-16
 *
 */
public class UserEnum {

	/**
	 * 用户状态
	 * */
	public enum USER_STATE{
		VALID 									(1,"有效"),
		INVALID_1               				(-1,"注销"),
		INVALID_0               				(0,"无效");

		private Integer EnumKey;
		private String EnumValue;
		USER_STATE(Integer EnumKey, String EnumValue){
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
			USER_STATE[] enums = values();
			for(USER_STATE e:enums){
				outMap.put(e.EnumKey,e.EnumValue);
			}
			return outMap;
		}

		public static USER_STATE getByEnumKey(Integer EnumKey){
			USER_STATE[] enums = values();
			for(USER_STATE e:enums){
				if(e.EnumKey.equals(EnumKey)){
					return e;
				}
			}
			return null;
		}
	}

	/**
	 * 用户性别
	 * */
	public enum USER_SEX{

		MAN               					(1,"男"),
		WOMAN               				(2,"女性"),
		OTHER               				(0,"未知");
		private Integer EnumKey;
		private String EnumValue;
		USER_SEX(Integer EnumKey, String EnumValue){
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
			USER_SEX[] enums = values();
			for(USER_SEX e:enums){
				outMap.put(e.EnumKey,e.EnumValue);
			}
			return outMap;
		}

		public static USER_SEX getByEnumKey(Integer EnumKey){
			USER_SEX[] enums = values();
			for(USER_SEX e:enums){
				if(e.EnumKey.equals(EnumKey)){
					return e;
				}
			}
			return null;
		}
	}

	/**
	 * 用户黑名单状态
	 * */
	public enum USER_BACK_LIST_STATE{
		VALID 									(1,"是"),
		INVALID               					(0,"不是");

		private Integer EnumKey;
		private String EnumValue;
		USER_BACK_LIST_STATE(Integer EnumKey, String EnumValue){
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
			USER_BACK_LIST_STATE[] enums = values();
			for(USER_BACK_LIST_STATE e:enums){
				outMap.put(e.EnumKey,e.EnumValue);
			}
			return outMap;
		}

		public static USER_BACK_LIST_STATE getByEnumKey(String EnumKey){
			USER_BACK_LIST_STATE[] enums = values();
			for(USER_BACK_LIST_STATE e:enums){
				if(e.EnumKey.equals(EnumKey)){
					return e;
				}
			}
			return null;
		}
	}

	/**
	 * 用户注册客户端
	 * */
	public enum USER_REGISTER_CLIENT{
		WECHAT 									("WECHAT","微信");

		private String EnumKey;
		private String EnumValue;
		USER_REGISTER_CLIENT(String EnumKey, String EnumValue){
			this.EnumKey = EnumKey;
			this.EnumValue = EnumValue;
		}
		public String EnumKey(){
			return EnumKey;
		}

		public String EnumValue(){
			return EnumValue;
		}

		public static Map<String,Object> EnumValueS(){
			Map<String,Object> outMap = new TreeMap<>();
			USER_REGISTER_CLIENT[] enums = values();
			for(USER_REGISTER_CLIENT e:enums){
				outMap.put(e.EnumKey,e.EnumValue);
			}
			return outMap;
		}

		public static USER_REGISTER_CLIENT getByEnumKey(String EnumKey){
			USER_REGISTER_CLIENT[] enums = values();
			for(USER_REGISTER_CLIENT e:enums){
				if(e.EnumKey.equals(EnumKey)){
					return e;
				}
			}
			return null;
		}
	}



}

