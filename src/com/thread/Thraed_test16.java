package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//定义一个实现Callable接口的实现类
class MyThread_6 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int i=0;
		while(i++<5) {
			System.out.println(Thread.currentThread().getName()+"的call()的方法");
		}
		return i;
	}
	
}
public class Thraed_test16 {

	public static void main(String[] args) throws Exception, ExecutionException {
		//创建Callable的接口的实现类
		MyThread_6 mt6=new MyThread_6();
		//使用Excutors线程执行类创建可扩展的线程池
		ExecutorService excutor=Executors.newCachedThreadPool();
		//将Callable接口实现类的对象提交到线程池进行管理
		Future<Object> result1=excutor.submit(mt6);
		Future<Object> result2=excutor.submit(mt6);
		//关闭线程
		excutor.shutdown();
		System.out.println("thread_1返回的结果"+result1.get());
		System.out.println("thread_2返回的结果"+result1.get());
	}

}
