package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class E_03 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("date_1");
		list.add("date_2");
		list.add("date_3");
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			Object obj=iterator.next();
			System.out.println(obj);
		}

	}

}
