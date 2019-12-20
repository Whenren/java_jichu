package com.yaodeyu;

public class Test {

	public Test() {
		System.out.println("构造方法一被调用了");
	}
	public Test(int x) {
		this();
		System.out.println("构造方法二被调用了");
	}
	public Test(boolean b) {
		this(1);
		System.out.println("构造方法三被调用了");
	}
	public static void main(String[]args) {
		Test test=new Test(true);
	}
}
