package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread__ implements Callable<Object> {

	
	@Override
	public Object call() throws Exception {
		int i=0;
		while(i++<15) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
	}
		return i;
}
}
public class Thread_test3 {

	public static void main(String[] args) throws Exception, ExecutionException {
		MyThread__ mt1=new MyThread__();
		FutureTask<Object> ft1=new FutureTask<Object>(mt1);
		Thread t1=new Thread(ft1,"thread1");
		t1.start();
		
		MyThread__ mt2=new MyThread__();
		FutureTask<Object> ft2=new FutureTask<Object>(mt2);
		Thread t2=new Thread(ft2,"thread2");
		t2.start();
		new Thread(new FutureTask<Object>(new MyThread__()),"thread3").start();
		System.out.println("线程1返回的结果:"+ft1.get());
		System.out.println("线程2返回的结果:"+ft2.get());
	}

}
