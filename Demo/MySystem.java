package com.��.Demo;

public class MySystem {
      //�������
	private String name;
	 
	public static MyOut out= new MyOut("AAA" );
	
	  //����
	public MySystem(String name ){
		this.name=name;
		 
	}
	  //����
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
