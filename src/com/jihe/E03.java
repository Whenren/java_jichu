package com.jihe;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class E03 {

	public static void main(String[] args) {
		Test test=new Test();
		
		ArrayList<Object> arrayList=new ArrayList<>();
		long kssj1=System.currentTimeMillis();
		test.listTest(arrayList);
		long jssj1=System.currentTimeMillis();
		System.out.println("用ArrayList插入15万个元素花费"+(jssj1-kssj1)+"毫秒");
		
		long kssj3=System.currentTimeMillis();
		test.listRead(arrayList);
		long jssj3=System.currentTimeMillis();
		System.out.println("用ArrayList读取15万个元素花费"+(jssj3-kssj3)+"毫秒");
		
		LinkedList<Object> linkedList=new LinkedList<>();
		long kssj2=System.currentTimeMillis();
		test.listTest(linkedList);
		long jssj2=System.currentTimeMillis();
		System.out.println("用LinkedList插入15万个元素花费"+(jssj2-kssj2)+"毫秒");
	
		long kssj4=System.currentTimeMillis();
		test.listRead(linkedList);
		long jssj4=System.currentTimeMillis();
		System.out.println("用linkedList读取15万个元素花费"+(jssj4-kssj4)+"毫秒");
	}
}
class Test{
	public  void listTest(List<Object> list) {
		for(int i=0;i<150000;i++) {
			list.add(0,i);
		}
	}	
	public  void listRead(List<Object> list) {
		for(int i=150000-1;i>=0;i--) {
			list.get(i);
		}
	}	
}


