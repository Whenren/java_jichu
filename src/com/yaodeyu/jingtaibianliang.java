package com.yaodeyu;

class Student {
	static String schoolName;						//声明静态变量schoolName
}
public class jingtaibianliang{
	public static void main(String[]args) {
		Student s1=new Student();					//创建第一个学生对象
		Student s2=new Student();					//创建第二个学生对象
		Student.schoolName="江汉艺术职业学院";			//为静态变量赋值
													//分别输出两个学生对象的信息
		System.out.println("我是"+s1.schoolName+"的学生");
		System.out.println("我是"+s2.schoolName+"的学生");
	}
	
}