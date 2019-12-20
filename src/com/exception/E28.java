package com.exception;

public class E28 {

	public static void main(String[] args) {
		int result=divide(4,0);
		System.out.println(result);
	}
	private static int divide(int x,int y) {
		return x/y;
	}

}
