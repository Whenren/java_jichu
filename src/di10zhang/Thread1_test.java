package di10zhang;

class MyThread1 extends Thread{
	public MyThread1(String name) {
		super(name);
	}

public void run() {
	int i=0;
	while(i++<5) {
		System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
	}
}
}
public class Thread1_test {

	public static void main(String[] args) {
		MyThread1 thread1=new MyThread1("thread1");
		thread1.start();
		
		MyThread1 thread12=new MyThread1("thread2");
		thread12.start();

	}

}
