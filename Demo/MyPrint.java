package com.��.Demo;

public class MyPrint {
	//�������
	private  static String name;
	 
	//����
	public MyPrint(String name ){
		this.name=name;
	 
	}
	//����
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
