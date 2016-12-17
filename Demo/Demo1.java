package com.类.Demo;
/**
 * 组合+static
 *
 */
public class Demo1 {
   public void test(){
	   MySystem mysys=new MySystem("ddd" );
	   
	   System.out.println(mysys.getName());
	   //通过对象调用
	  mysys.out.intro();
	  //通过类直接调用
	  MySystem.out.intro();
	  //三级组合调用
	  MySystem.out.print.intro();
   }
}
