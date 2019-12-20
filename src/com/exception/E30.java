package com.exception;
class BlcException extends Exception{
	public  BlcException() {
		super();
	}
	public  BlcException(String message) {
		super(message);
	}
}
public class E30 {
	public static int divide(int x,int y)throws BlcException{
		if (y==0) {
			throw new BlcException("除数是0");
		}
		int result=x/y;
		return result;
	}
	public static void main(String[]args) {
		try {
			int result =divide(4,0);
			System.out.println(result);
		}catch (BlcException e) {
			System.out.println("捕获的异常信息为:"+e.getMessage());
		}
	}
	
}
