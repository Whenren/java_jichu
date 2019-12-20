 package com.yaodeyu;

public class Recurisve {
	//递归求和
	//在方法的内部自己调用自己，就叫方法的递归，一般来说参数值不一样
	public static int getSum(int n){
		if(n==1)return 1;
		return n+getSum(n-1);
	}
	public static void main(String[]args) {
		System.out.println("1到100的和是"+getSum(100));
	}
}
