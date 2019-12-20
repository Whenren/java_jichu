package com.yaodeyu;

import java.lang.invoke.ConstantCallSite;

public class Constant {
	public static void main(String[] args) {
		System.out.println("二进制以0b开头"+0b11000110);
		System.out.println("八进制以0开头"+00306);
		System.out.println("十六进制以0x开头"+0xc6);
		System.out.println("5.022e+6f="+5.022e+6f);
		System.out.println("5.022e+8="+5.022e+8);
		System.out.println("5.022e+8d="+5.022e+8d);
		System.out.println("我的名字是"+'\u59da'+'\u5fb7'+'\u5b87');
		System.out.println("Welcome,\nMonitor");
		System.out.println("布尔常量"+true+"或"+false);
		System.out.println("引用数据类型常量"+null);
		int a=5;
		//a=null;
		Constant constant=new Constant();
		constant=null;
		
	}

}
