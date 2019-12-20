package com.yaodeyu;

public class Test_2 {

	public static void main(String[] args) {
		byte x=1;
		short s=1;
		int a=1;
		long b=1;
		float f=1.0f;
		double d=1.0;
		char c=97;
		System.out.println("字节型数据的长度是"+Byte.SIZE);
		System.out.println("短整型数据的长度是"+Short.SIZE);
		System.out.println("整型数据的长度是"+Integer.SIZE);
		System.out.println("长整形数据的长度是"+Long.SIZE);
		System.out.println("单精度浮点型数据的长度是"+Float.SIZE);
		System.out.println("双精度浮点型数据的长度是"+Double.SIZE);
		System.out.println("字符型数据的长度是"+Character.SIZE);
		System.out.println("字节型数据的取值范围是"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("短整型数据的取值范围是"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("整型数据的取值范围是"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("长整形数据的取值范围是"+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		System.out.println("单精度浮点型数据的取值范围是"+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		System.out.println("双精度浮点型数据的取值范围是"+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		System.out.println("字符型数据的取值范围是"+(int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
	}

}
