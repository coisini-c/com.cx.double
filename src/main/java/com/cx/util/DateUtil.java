package com.cx.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateUtil {

	/**
	 * @throws ParseException 
	 * 
	    * @Title: getDateByInitMonth
	    * @Description: 返回某日期的月初
	    * @param @param src
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static String getDateByInitMonth(String tim) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		Calendar c=Calendar.getInstance();
		c.setTime(sdf.parse(tim));
		c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		
		
		return sdf.format(c.getTime());
		//TODO 实现代码
		}
	/**
	 * @throws ParseException 
	 * 
	    * @Title: getDateByFullMonth
	    * @Description: 返回某月的月尾
	    * @param @param src
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static String getDateByFullMonth(String tim) throws ParseException{
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		Calendar c=Calendar.getInstance();
		c.setTime(sdf.parse(tim));
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 59);
		c.set(Calendar.SECOND, 59);
		c.set(Calendar.MILLISECOND, 59);
		
		
		return sdf.format(c.getTime());
		
		//TODO 实现代码
		}

	public static void main(String[] args) throws ParseException {
		String dateByInitMonth = DateUtil.getDateByInitMonth("2020-3-9 12:37:40");
		System.out.println(dateByInitMonth);
		
		
		  String dateByFullMonth = DateUtil.getDateByFullMonth("2020-3-9 12:37:40");
		  System.out.println(dateByFullMonth);
		 
	}

}
