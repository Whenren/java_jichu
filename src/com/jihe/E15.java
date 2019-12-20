package com.jihe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class E15 {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("1","Jack");
		map.put("2","Rose");
		map.put("3","Lucy");
		System.out.println(map);
		Set<String> keySet=map.keySet();
		Iterator<String> it =keySet.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			Object value=map.get(key);
			System.out.println(key+":"+value);
		}
		Map<String, String> map1=new HashMap<String, String>();
		map1.put("1","Jack");
		map1.put("2","Rose");
		map1.put("3","Lucy");
		System.out.println(map1);
		Set<?> entrySet=map1.entrySet();
		Iterator<?> it1 =entrySet.iterator();
		while(it1.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry=(Map.Entry)(it1.next());
			Object key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+":"+value);
		}

	}

}
