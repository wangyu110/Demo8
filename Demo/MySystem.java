package com.类.Demo;

public class MySystem {
      //定义变量
	private String name;
	 
	public static MyOut out= new MyOut("AAA" );
	
	  //构造
	public MySystem(String name ){
		this.name=name;
		 
	}
	  //方法
	public void intro(){
		System.out.println("name:"+name );
	}
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	
}
