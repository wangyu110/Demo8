package com.��.Demo;

import javax.naming.CommunicationException;

/**
 * �о��ࣺ
 * 1.String  ,StringBuilder��StringBuffer         
 * 2.Math ,Random
 * 3.System
 * 4.Date
 * 5.Scanner
 * 
 */

public class Demo {

	/**
	 * ����String����
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
	 * ��������
	 */
	public void test1(){
		String s1="hello";
		 
	}
	/**
	 * ���Է���
	 */
	public void test2(){
		String s1="���";
		String s2="world!";
	//����length
		System.out.println("length:"+s2.length());
	//ƴ��concat
		String s3=s1.concat(" ���ţ�");
		System.out.println("concat:"+s3);
	//��ȡsubString
		String s4=s2.substring(1, 4);
		System.out.println(" subString:"+s4);
		
		char c=s3.charAt(3);
		System.out.println(" char:"+c);
	//�Ƚ�(�Ƚ������Ƿ�һ����equalsIgnore Case�������Сд)
		String s5="wangwu";
		String s6="wangwu";
		String s7="WANGWU";
		System.out.println(" equals:"+s6.equals(s5));
		System.out.println(" equals:"+s6.equals(s7));
		System.out.println(" equals:"+s6.equalsIgnoreCase(s7));
	//start,end(�Ƿ���start��ʼ����end����)
		System.out.println("start:"+s6.startsWith("wang"));
		System.out.println("end:"+s7.endsWith("WU"));
	//����contains(""){�Ƿ���""�Ķ���}
		String s8="i love you";
		System.out.println("love:" + s8.contains("love"));
	//�滻replace("1","2")	{��2ȡ��1}
	      String s9="i hate the world,i hate the life ";
		System.out.println(s9);
		if (s9.contains("life") && s9.contains("hate")) {
			String s10 = s9.replace("hate", "love");
			System.out.println(s10);
	//���
		}
	}
	
	
	
	
	
	
	
	
}
