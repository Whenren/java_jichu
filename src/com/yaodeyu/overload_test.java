package com.yaodeyu;

public class overload_test {

	public static void main(String[] args) {
		System.out.println(overload.add(3,5));
		System.out.println(overload.add(3,5,6));
		
		overload o1=new overload();
		System.out.println(o1.add(3.1,5.2));
	}

}
