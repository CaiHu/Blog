package test;

import java.util.Date;

import com.xiaohu.util.StringDateParseUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = StringDateParseUtil.getDate("1989-3-9");
		System.out.println(date);
		System.out.println(StringDateParseUtil.getStringDate(date));
	}

}
