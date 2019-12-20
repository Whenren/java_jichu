package com.jihe;

import java.util.ArrayList;
public class E04 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("date_1");
		list.add("date_2");
		list.add("date_3");
		for(Object obj:list) {
			System.out.println(obj);
		}
	}

}
