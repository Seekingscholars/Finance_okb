package com.cn.utils.context;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类.封装成线程模式.
 * @author nmnl
 * @version 1.0.0
 * @date 2018-04-09 21:16
 *
 */
public class EDateUtils {

	public static final String DATEFORMAT_STR_001 = "yyyy-MM-dd HH:mm:ss";
	public static final String DATEFORMAT_STR_002 = "yyyy-MM-dd";
	public static final String DATEFORMAT_STR_003 = "MM-dd";
	public static final String DATEFORMAT_STR_004 = "HH:mm:ss";
	public static final String DATEFORMAT_STR_009 = "yyMMdd";
	public static final String DATEFORMAT_STR_010 = "MMdd";
	public static final String DATEFORMAT_STR_011 = "yyyyMMddHHmmss";
	public static final String DATEFORMAT_STR_012 = "yyyyMMdd";
	public static final String DATEFORMAT_STR_013 = "yyyyMM";
	public static final String DATEFORMAT_STR_014 = "HHmmss";
	public static final String DATEFORMAT_STR_015 = "yyyyMMdd HH:mm:ss";
	public static final String DATEFORMAT_STR_016 = "yyyyMMddHHmmssSSS";
	public static final String DATEFORMAT_STR_017 = "yyyyMMddHHss";
	public static final String DATEFORMAT_STR_021 = "yyyy年MM月dd日 HH时mm分ss秒";
	public static final String DATEFORMAT_STR_022 = "yyyy年MM月dd日";
	public static final String DATEFORMAT_STR_023 = "MM月dd日 hh:mm";
	public static final String DATEFORMAT_STR_032 = "yyyy/MM/dd";
	public static final String DATEFORMAT_STR_033 = "yyyy/MM/dd HH:mm:ss";
	public static final String YYYY_MM_DD_HH_MM_SS="yyyy-MM-dd HH:mm:ss";

	private final static int[] dayArr = new int[] { 20, 19, 21, 20, 21, 22, 23,
			23, 23, 24, 23, 22 };
	private final static String[] constellationArr = new String[] { "摩羯座",
			"水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座",
			"天蝎座", "射手座", "摩羯座" };

	/**
	 * 通过生日计算星座
	 *
	 * @param month
	 * @param day
	 * @return String
	 */
	public static String getConstellation(int month, int day) {
		return day < dayArr[month - 1] ? constellationArr[month - 1]
				: constellationArr[month];
	}

	/**
	 * yyyy年MM月dd日 HH时mm分ss秒
	 */
	public static final ThreadLocal<DateFormat> YYYY_MM_DD_HH_MM_SS_CN = new ThreadLocal<DateFormat>(){
		@Override
		protected DateFormat initialValue(){
			return new SimpleDateFormat(DATEFORMAT_STR_021);
		}
	};

	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public static final ThreadLocal<DateFormat> YYYY_MM_DD_HH_MM_SS_EN = new ThreadLocal<DateFormat>(){
		@Override
		protected DateFormat initialValue(){
			return new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
		}
	};

	/**
	 * yyyyMMddHHmmss
	 */
	public static final ThreadLocal<DateFormat> YYYYMMDDHHMMSS = new ThreadLocal<DateFormat>(){
		@Override
		protected DateFormat initialValue(){
			return new SimpleDateFormat(DATEFORMAT_STR_011);
		}
	};

	/**
	 * MMdd
	 */
	public static final ThreadLocal<DateFormat> MMDD = new ThreadLocal<DateFormat>(){
		@Override
		protected DateFormat initialValue(){
			return new SimpleDateFormat(DATEFORMAT_STR_009);
		}
	};

	/**
	 * MMdd
	 */
	public static final ThreadLocal<DateFormat> yyyyMMdd = new ThreadLocal<DateFormat>(){
		@Override
		protected DateFormat initialValue(){
			return new SimpleDateFormat(DATEFORMAT_STR_012);
		}
	};


	public static void main(String[] args) throws ParseException {
		System.out.println(EDateUtils.YYYY_MM_DD_HH_MM_SS_EN.get().format(System.currentTimeMillis()));
		System.out.println(" ---- " + EDateUtils.YYYY_MM_DD_HH_MM_SS_EN.get().format(new Date()));
		System.out.println(EDateUtils.yyyyMMdd.get().format(System.currentTimeMillis()));
	}

}
