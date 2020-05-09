package com.cx.util;

public class FileUtil {
	/**
	 * 
	    * @Title: getExtendName
	    * @Description: 返回拓展名
	    * @param @param fileName
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String getExtendName(String fileName){
		
		String substring = fileName.substring(fileName.lastIndexOf("."));
		return substring;
		//TODO 实现代码
		}
	
	public static void main(String[] args) {
			String name = FileUtil.getExtendName("aaaa.jpg");
			System.out.println(name);
	}
}
