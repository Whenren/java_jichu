package com.functionalInterface;

import javax.print.attribute.PrintJobAttributeSet;

@FunctionalInterface
interface Calcable{
	int calc(int num);
}
class Math{
	public static int abs(int num) {
		if (num<0) {
			return -num;
		}else {
			return num;
		}
	}
}
public class E24 {

	public static void main(String[] args) {
		PrintAbs(-10,n->Math.abs(n));
		PrintAbs(-50,Math::abs);

	}

	private static void PrintAbs(int i, Calcable c) {
		System.out.println(c.calc(i));
		
	}

}
