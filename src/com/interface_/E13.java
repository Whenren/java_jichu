package com.interface_;
class A{
	void shout() {
		
	}
}

interface Animal{
	//接口中没有成员变量
	//只有public static final的成员变量
	//public static final 三个关键字可以省略
	public static final int ID=1;
	//abstract 抽象
	//接口中的方法都是public abstract
	//public abstract 两个关键字可以省略
	void shout();
	static int getID() {
		return Animal.ID;
	}
}
interface LandAnimal extends Animal{
	void run();
}
class Dog implements LandAnimal{
	@Override
	public void shout() {
		System.out.println("汪汪....");
	}
	public void run() {
		System.out.println("狗在陆地上跑");
	}
}

public class E13 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
		dog.run();
		System.out.print(Animal.getID());
	}

}
