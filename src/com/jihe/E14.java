package com.jihe;

import java.util.HashMap;
import java.util.Map;

public class E14 {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("1","Jack");
		map.put("2","Rose");
		map.put("3","Lucy");
		map.put("4","Lucy");
		map.put("1","Tom");
		System.out.println(map);
		System.out.println(map.containsKey("1"));
		System.out.println(map.get("1"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		map.replace("1","Tom2");
		System.out.println(map);
		map.remove("1");
		System.out.println(map);

	}

}
