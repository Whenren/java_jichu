package com.jihe;

import java.util.LinkedList;

public class E02 {

	public static void main(String[] args) {
		LinkedList<Object> link=new LinkedList<Object>();
		link.add("stu1");
		link.add("stu2");
		System.out.println(link);
		link.offer("offer");
		link.push("push");
		System.out.println(link);
		Object object=link.peek();
		System.out.println(object);
		link.removeFirst();
		link.pollLast();
		System.out.println(link);

	}

}
