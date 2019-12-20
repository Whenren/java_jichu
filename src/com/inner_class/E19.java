package com.inner_class;
class 	Outer{
	static int m=0;
	void test1() {
		System.out.println("外部类成员方法");
	}
	void test2() {
		class Inner{
			int n=1;
			void show() {
				System.out.println("外部类变量m="+m);
				test1();
			}
		}
		Inner inner=new Inner();
		System.out.println("局部内部变量n="+inner.n);
		inner.show();
	}
		static class Inner{
			void show() {
				System.out.println("外部类静态变量m="+m);
			}
		}
}
	
public class E19 {

	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.test2();

		Outer.Inner inner=new Outer.Inner();
		inner.show();
	}

}
