package com.jihe;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class E31 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("张小明");
		list.add("张阳");
		list.add("张小琴");
		list.add("张大琴");
		Stream<String>stream=list.stream();
		Stream<String>stream2=stream.filter(i->i.startsWith("张"));
		Stream<String>stream3=stream2.limit(2);
		stream3.forEach(j->System.out.println(j));
		System.out.println("=============");
		list.stream().filter(i->i.startsWith("张"))
				.filter(i->i.length()>2)
				.forEach(j->System.out.println(j));
		
	}

}
