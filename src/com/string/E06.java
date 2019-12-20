package com.string;

public class E06 {

	public static void main(String[] args) {
		String string="2018-01-24";
		System.out.println("从第6个字符截取到末尾的结果："+string.substring(5));
		System.out.println("从第6 个字符截取到第7个字符的结果:"+string.substring(5,7));
		System.out.println("分割后的字符串数组中的元素依次为:");
		String[] strArray=string.split("-");
		for(int i=0;i<strArray.length;i++) {
			if(i!=strArray.length-1) {
				System.out.print(strArray[i]+"、");
			}else {
				System.out.println(strArray[i]);
			}
		}

	}

}
