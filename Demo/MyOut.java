package com.��.Demo;

public class MyOut {
	 
	//�������
//	private String name;
	
	public  MyPrint print=new MyPrint("sss" );//��̬����
	
	private static String name;
	 
	//����
	 public MyOut(String name ){
		this.name=name;	 
	}
	//����
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
