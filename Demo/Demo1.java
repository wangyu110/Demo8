package com.��.Demo;
/**
 * ���+static
 *
 */
public class Demo1 {
   public void test(){
	   MySystem mysys=new MySystem("ddd" );
	   
	   System.out.println(mysys.getName());
	   //ͨ���������
	  mysys.out.intro();
	  //ͨ����ֱ�ӵ���
	  MySystem.out.intro();
	  //������ϵ���
	  MySystem.out.print.intro();
   }
}
