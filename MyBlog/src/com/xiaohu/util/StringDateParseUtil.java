package com.xiaohu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDateParseUtil {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	private static SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");

	//返回日期转换后的string ，包含时分秒
	public static String getString(Date date) {
		String dateStr = sdf.format(date);
		return dateStr;
	}
	
	//返回日期 ，包含时分秒
	public static Date getDateTime(String str) {
		Date date = null;
		if (str == null || "".equals(str)) {
			date = new Date();
		} else {
			try {
				date = sdf.parse(str);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return date;
	}
	
	//返回日期转换后的string ，不包含时分秒
	public static String getStringDate(Date date) {
		String dateStr = sdfDate.format(date);
		return dateStr;
	}
	//返回日期 ，不包含时分秒
	public static Date getDate(String str) {
		Date date = null;
		if (str == null || "".equals(str)) {
			date = new Date();
		} else {
			try {
				date = sdfDate.parse(str);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return date;
	}

}
