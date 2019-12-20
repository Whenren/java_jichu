package com.gc;

class Person extends Object{
	@Override
	public void finalize() {
		System.out.println("对象被当做垃圾回收.....");
	}
	
}
public class E37 {
	private static void huishoulaji1() {
		Person p1=new Person();
		p1=null;
		int i=1;
		while(i<10) {
			System.out.println("方法1循环中-----------");
			i++;
		}
	}
	
	private static void huishoulaji2() {
		Person p2=new Person();
		p2=null;
		System.gc();
		int i=1;
		while(i<10) {
			System.out.println("方法2循环中-----------");
			i++;
		}
		
	}
	public static void main(String[] args) {
		huishoulaji1();
		System.out.println("=====================");
		huishoulaji2();
	}
}
