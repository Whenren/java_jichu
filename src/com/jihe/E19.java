package com.jihe;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;
class CustomComparator implements Comparator<Object>{
	public int compare(Object obj1,Object obj2) {
		String key1=(String) obj1;
		String key2=(String) obj2;
		return key2.compareTo(key1);
	}
}

public class E19 {

	public static void main(String[] args) {
		Map<String, String> map=new TreeMap<String, String>();
		map.put("1","Jack");
		map.put("2","Rose");
		map.put("3","Lucy");
		System.out.println(map);
		
		Map<String, String> map1=new TreeMap<String, String>(new CustomComparator());
		map1.put("2","Rose");
		map1.put("1","Jack");
		map1.put("3","Lucy");
		System.out.println(map1);
	}

}

