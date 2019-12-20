package com.functionalInterface;



@FunctionalInterface
interface PersonBuilder{
	Person buildPerson(String name);
}
class Person{
	private String name;

	public Person(String name) {
		this.name=name;
	}

	public String getName() { 
		return name;
	} 
	
	
	
}
public class E26 {

	public static void main(String[] args) {
		PrinterName("刘德华",new PersonBuilder(){
			@Override
			public Person buildPerson(String name) {
				return new Person(name);
			}
		});
		PrinterName("张学友",name->new Person(name));
		PrinterName("郭富城",Person::new);
	}

	private static void PrinterName(String name, PersonBuilder pb) {
		// TODO 自动生成的方法存根
		System.out.println(pb.buildPerson(name).getName());
	}

}
