package com.类.Demo;

public class MyPrint {
	//定义变量
	private  static String name;
	 
	//构造
	public MyPrint(String name ){
		this.name=name;
	 
	}
	//方法
	public  static void intro(){
		System.out.println(name+"this is print sss" );
	}
    //getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
	
}
