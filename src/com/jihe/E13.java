package com.jihe;

import java.util.Comparator;
import java.util.TreeSet;

class MyCoparator implements Comparator<Object>{
	@Override
	public int compare(Object obj1,Object obj2) {
		String s1=(String) obj1;
		String s2=(String) obj2;
		int temp=s1.length()-s2.length();
		return temp;
	}

}
public class E13 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(new MyCoparator());
		//如果使用TreeSet默认的比较器插入字符串，则会使用字符串类的CompareTo方法
		//按照英文字母或者数字的顺序进行排序插入集合
		//如果使用自定义的比较器MyCoparator插入字符串，则会使用自定义的比较器类的Compare方法
		//按照字符长度的顺序进行排序插入集合，如果长度相同，则TreeSet认为是同一个元素，无法插入集合
		ts.add("Jack");
		ts.add("Helena");
		ts.add("Eve");
		System.out.println(ts);
		
		TreeSet<String> ts2=new TreeSet<String>((obj1,obj2)->{
			String s1=(String) obj1;
			String s2=(String) obj2;
			return s1.length()-s2.length();
		});
		ts2.add("Jack");
		ts2.add("Helena");
		ts2.add("Eve");
		System.out.println(ts2);
	}

}
