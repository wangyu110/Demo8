package com.��.Demo;
	/**
	 * Boss��
	 * ����ģ��      ��ֻ������һ������
	 * ��������
	 * ����һ������
	 */
 public class Boss {
	 //����
	 private String name;
	 private int age;
	 
	 //����
	 public  Boss(String name,int age ){
		 this.name=name;
		 this.age=age;
		  
	 }
	 //����
	 public void eat(){
		 System.out.println(name+",ϲ��������ȫϯ");
	 }
	 public void sleep(){
		 System.out.println(name+",�������ݣ�");
	 }
	 /*
	  * ��ȡ���󷽷�
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

 
