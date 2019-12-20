package com.string;

public class E03 {

	public static void main(String[] args) {
		String s="sf1sd我3fs1f爱d33你s0g中9sd国g0sdg9sdg9sd5hnh";
		char[]	charArray=s.toCharArray();
		System.out.println("将字符串转为字符数组的遍历结果：");
		for(int i=0;i<charArray.length;i++) {
			if(i!=charArray.length-1) {
				System.out.println(charArray[i]+",");
			}else {
				System.out.println(charArray[i]);
			}
		}
		System.out.print("字符串的数字是：");
		for(char zf:charArray) {
			if(zf>='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
		System.out.print("\n字符串的汉字是：");
		for(char zf:charArray) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf);
			}
		}
		System.out.println("\n将int值转换为String类型之后的结果："+String.valueOf(12));
		System.out.println("将字符串转换成大写之后的结果:"+s.toUpperCase());
	}

}
