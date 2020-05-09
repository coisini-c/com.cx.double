package com.cx.util;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class StreamUtil {
	/**
	 * 
	    * @Title: closeAll
	    * @Description: 批量关闭流
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	public static void closeAll(Closeable...io){
		for (Closeable temp:io) {
			try {
			if (temp!=null) {
				
					temp.close();
				
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	/**
	 * 
	    * @Title: readTextFile
	    * @Description: 传入一个文本文件返回该文件内容，并且关闭流
	    * @param @param src
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	public static String readTextFile(InputStream src){
		ObjectInputStream os=null;
		try {
			os=new ObjectInputStream(src);
			String readLine = os.readLine();
			return readLine;
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			StreamUtil.closeAll(os);
		}
		
		
		return null ;
		//TODO 实现代码
		}
/**
 * 
    * @Title: readTextFile
    * @Description:：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5
    * @param @param txtFile
    * @param @return    参数
    * @return String    返回类型
    * @throws
 */
	public static String readTextFile(File txtFile){
		StreamUtil.readTextFile(txtFile);
		return null;
		//TODO 实现代码
		}
	public static void main(String[] args) {
		String readTextFile = null;
		try {
			readTextFile = StreamUtil.readTextFile(new FileInputStream(new File("F:\\test\\tet.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(readTextFile);
	}



}
