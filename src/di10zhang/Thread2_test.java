package di10zhang;

class MyThread2 implements Runnable{
	public void run() {
		int i=0;
		while(i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}

public class Thread2_test {

	public void main(String[] args) {
		MyThread2 mt1=new MyThread2();
		Thread t1=new Thread(mt1,"thread1");
		t1.start();
		MyThread2 mt2=new MyThread2();
		Thread t2=new Thread(mt2,"thread2");
		t2.start();


	}
}

