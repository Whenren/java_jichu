package com.functionalInterface;
@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E25 {

	public static void main(String[] args) {
		StringUtils stu=new StringUtils();
		printUpper("hello",t->stu.printUpperCase(t));
		printUpper("hello",stu::printUpperCase);
	}

	private static void printUpper(String text,Printable p) {
		p.print(text);
		
	}

}
