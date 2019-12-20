package com.inner_class;
interface Animal{
	void shout();
}
class Cat implements Animal{

	@Override
	public void shout() {
		System.out.println("miaomiao");
		
	}
	
}
public class E20 {

	public static void main(String[] args) {
		
		String name="花猫";
		//第一种方式:
		//外部类 外部类的对象=new 外部类()创建对象
		Cat cat=new Cat();
		cat.shout();
		//第二种方式:
		//匿名内部类:做为方法的参数，有具体的实现语句
		animalShout(new Animal (){
			@Override
			public void shout() {
				System.out.println("miaomiao");
			}
		});
		//第三种方式:
		//用lambda表达式作为参数传递给animalShout方法
		//()对应shout方法后面的括号->是表达式箭牌{}里面的语句是方法主体
		animalShout(()->System.out.println("Lambda表达式输出:"+name+"喵喵...."));
	}

	private static void animalShout(Animal an) {
		an.shout();
		
	}


}
