package com.cn.utils.context;

import java.util.HashMap;
import java.util.Map;


/**
 * 启动加载缓存类
 *
 * @author nmnl
 * @version 1.0.0
 * @date 2018-04-09 13:56
 *
 */
public class Global {

	public static Map<String, Object> configMap;

	static {
		configMap = new HashMap<>();
	}

	private static Object get(String key){
		return configMap.get(key);
	}

	public static Integer getInteger(String key){
		Integer integer = 0;
		Object object = get(key);
		if(null != object){
			integer = Integer.valueOf(object.toString());
		}
		return integer;
	}

	public static Double getDouble(String key){
		Double aDouble = 0d;
		Object object = get(key);
		if(null != object){
			aDouble = Double.valueOf(object.toString());
		}
		return aDouble;
	}

	public static String getString(String key) {
		return get(key).toString();
	}
	
	public static void del(){
		configMap.clear();
	}
	
	public static void put(String key,Object value){
		configMap.put(key,value);
	}
}
