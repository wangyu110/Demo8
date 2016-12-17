package com.类.Demo;

public class MyOut {
	 
	//定义变量
//	private String name;
	
	public  MyPrint print=new MyPrint("sss" );//静态属性
	
	private static String name;
	 
	//构造
	 public MyOut(String name ){
		this.name=name;	 
	}
	//方法
	public static void intro(){
		System.out.println( name +"this is out aaa");
	} 
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
	 

}
