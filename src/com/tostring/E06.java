package com.tostring;



class Animal {
	void shout() {
		System.out.println("动物叫！");
	}
	@Override
	public String toString(){
		return "这是一只动物!";
	}
}
class Dog extends Animal{
	@Override
	public String toString(){
		return "这是一只动物!";
	}
}
public class E06 {
	public static void main(String[]args) {
		Animal dw=new Animal();
		Dog xg=new Dog();
		System.out.println(dw);
		System.out.println(xg);
	}
}
