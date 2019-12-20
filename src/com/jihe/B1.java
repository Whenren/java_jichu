package com.jihe;

import java.util.HashSet;

class Person{
	String id;
	int age;
	public Person(String id, int age) {
		super();
		this.id = id;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return  id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		return id.equals(other.id);
	}
	@Override
	public String toString() {
		return id+":" + age;
	}
	
}
public class B1 {

	public static void main(String[] args) {
		HashSet<Person> hs=new HashSet<Person>();
		hs.add(new Person("Jack",20));
		hs.add(new Person("Jack",18));
		hs.add(new Person("Rose",18));
		System.out.println(hs);

	}

}
