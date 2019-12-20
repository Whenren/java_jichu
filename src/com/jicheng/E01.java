package com.jicheng;

import javax.net.ssl.ExtendedSSLSession;

class Animal{
	String name;
	public Animal(){
		System.out.println("我是一只动物");
	}
	public Animal(String name) {
		System.out.println("我是一只"+name);
	}
	void shout() {
		System.out.println("动物发出叫声");
	}
}
class Dog extends Animal{
	/*public void printName() {
		System.out.println("name="+name);
	}*/
	public Dog() {
		super("沙皮狗");
		//System.out.println("汪汪.....");
	}
}
public class E01 {

	public static void main(String[] args) {
		Dog dog =new Dog();
		/*dog.name="沙皮狗";
		dog.printName();
		dog.shout();*/

	}

}
