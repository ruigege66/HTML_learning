package com.bjpowernode.java_learning;

import java.util.LinkedList;

public class D109_2_SuperClass {
	public static void main(String[] args) {
		SuperClass109 superObj = new SuperClass109();
		superObj.MethodA();//访问了过时的方法，IDE会加上删除线
		System.out.println(superObj.var);//访问过时的域，也会加上删除线
		SubClass109 subObj = new SubClass109();
		subObj.MethodB1();
		//-------------
		//下面的注解用于抑制其下面的语句的编译警告信息
		@SuppressWarnings("rawtypes")
		LinkedList list = new LinkedList();
		//下面两条语句没有加@SuppressWarnings,编译时会出现警告信息
		list.add(123);
		list.add("Beijing");
		for(int i=0;i<2;i++) {
			System.out.println(list.get(i));
		}
		
	}

}
class SuperClass109{
	//对var进行注释，表示var已经过时，虽然var已经过时，但是仍然可以用
	@Deprecated
	int var = 125;
	@Deprecated
	public void MethodA() {
		System.out.println("父类中的Method()方法！");
	}
	public void MethodB() {
		System.out.println("父类中的MethodB方法！");
	}
	
}
class SubClass109 extends SuperClass109{
	//@Override
	public void MethodB1(){
		System.out.println("子类重写父类中的方法MethodB()!");
	}
}







