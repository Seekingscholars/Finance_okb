package com.cn.utils.order;


import java.util.UUID;

/**
 * 工具类-订单号生成
 * @author nmnl
 * @version 1.0
 * @date 2018-04-09 20:51
 *
 */
public class OrderNoUtil {

	/**
	 * 产生唯一 的序列号UUID
	 * @param bl true截取-,false不替换
	 * @return
	 */
	public static String getUUID(boolean bl){
		String uuid = UUID.randomUUID().toString();
		if (bl){
			uuid = uuid.replace("-","");
		}
		return uuid;
	}

	/**
	 * 产生唯一 的序列号
	 * @return
	 */
	public static String getSerialNumber() {
		return GenOrderNoUtil.nextId();
	}
	
}
