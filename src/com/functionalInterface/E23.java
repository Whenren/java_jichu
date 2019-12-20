package com.functionalInterface;
interface Animal{
	void shout();
}
//声明这是一个有参数和返回值类型的函数接口，有且仅有一个抽象方法
@FunctionalInterface
interface Calculate{
	int sum(int a,int b);
}
public class E23 {

	public static void main(String[] args) {
		//分别两个函数式接口进行测试
		animalShout(()->System.out.println("无参、无返回值的函数式接口调用"));
		showSum(10,20,(x,y)->x+y);

	}
	private static void animalShout(Animal animal){
		animal.shout();
	}
	private static void showSum(int x,int y,Calculate calculate) {
		System.out.println(x+"+"+y+"的和为:"+calculate.sum(x,y));
	}
}
