package com.jihe;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class B2 {

	public static void main(String[] args) {
		Map<String, String> map=new TreeMap<String, String>(new CustomComparator());
		map.put("5","Lucy");
		map.put("4","John");
		map.put("1","Smith");
		map.put("2","Aimee");
		map.put("3","Amanda");
		System.out.println(map);
		Set<String> keySet=map.keySet();
		Iterator<String> it =keySet.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}

	}

}
