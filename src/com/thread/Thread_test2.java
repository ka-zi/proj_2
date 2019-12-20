package com.thread;
class MyThread_ implements Runnable {

	public void run() {
		int i=0;
		while(i++<15) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}
public class Thread_test2 {

	public static void main(String[] args) {
		MyThread_ thread1=new MyThread_();
		Thread t1=new Thread(thread1,"thread1");
		t1.start();
		MyThread_ thread2=new MyThread_();
		Thread t2=new Thread(thread2,"thread2");
		t2.start();
	}

}
