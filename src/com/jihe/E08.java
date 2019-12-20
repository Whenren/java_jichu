package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class E08 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("date_1");
		list.add("date_2");
		list.add("date_3");
		System.out.println(list);
		Iterator<String> it=list.iterator();
		it.forEachRemaining(obj->System.out.println("迭代集合元素:"+obj));

	}

}
