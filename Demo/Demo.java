package com.类.Demo;

import javax.naming.CommunicationException;

/**
 * 研究类：
 * 1.String  ,StringBuilder，StringBuffer         
 * 2.Math ,Random
 * 3.System
 * 4.Date
 * 5.Scanner
 * 
 */

public class Demo {

	/**
	 * 构造String对象
	 */
	public void test(){
	String s1=new String();
			System.out.println("s1:"+s1);
     String s2=new String("hello");
     		System.out.println("s2:"+s2);
     String s3="world";
     		System.out.println("s3:"+s3);
     String s4=s2+s3;
        	System.out.println("s4:"+s4); 
	}  
	 
	/**
	 * 测试属性
	 */
	public void test1(){
		String s1="hello";
		 
	}
	/**
	 * 测试方法
	 */
	public void test2(){
		String s1="你好";
		String s2="world!";
	//长度length
		System.out.println("length:"+s2.length());
	//拼接concat
		String s3=s1.concat(" 老婆！");
		System.out.println("concat:"+s3);
	//截取subString
		String s4=s2.substring(1, 4);
		System.out.println(" subString:"+s4);
		
		char c=s3.charAt(3);
		System.out.println(" char:"+c);
	//比较(比较内容是否一样，equalsIgnore Case不区别大小写)
		String s5="wangwu";
		String s6="wangwu";
		String s7="WANGWU";
		System.out.println(" equals:"+s6.equals(s5));
		System.out.println(" equals:"+s6.equals(s7));
		System.out.println(" equals:"+s6.equalsIgnoreCase(s7));
	//start,end(是否以start开始，以end结束)
		System.out.println("start:"+s6.startsWith("wang"));
		System.out.println("end:"+s7.endsWith("WU"));
	//包含contains(""){是否有""的东西}
		String s8="i love you";
		System.out.println("love:" + s8.contains("love"));
	//替换replace("1","2")	{用2取代1}
	      String s9="i hate the world,i hate the life ";
		System.out.println(s9);
		if (s9.contains("life") && s9.contains("hate")) {
			String s10 = s9.replace("hate", "love");
			System.out.println(s10);
	//拆分
		}
	}
	
	
	
	
	
	
	
	
}
