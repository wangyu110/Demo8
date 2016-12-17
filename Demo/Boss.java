package com.类.Demo;
	/**
	 * Boss类
	 * 单类模型      （只有生成一个对象）
	 * 封死构造
	 * 定义一个对象
	 */
 public class Boss {
	 //属性
	 private String name;
	 private int age;
	 
	 //构造
	 public  Boss(String name,int age ){
		 this.name=name;
		 this.age=age;
		  
	 }
	 //方法
	 public void eat(){
		 System.out.println(name+",喜欢吃满汉全席");
	 }
	 public void sleep(){
		 System.out.println(name+",豪华宾馆！");
	 }
	 /*
	  * 获取对象方法
      *
      */
	 
	 
	 //getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	 
 }	  

 
