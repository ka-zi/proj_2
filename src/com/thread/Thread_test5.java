package com.thread;
class TicketWindow2 implements Runnable{
	private int tickets=80;
	public void run() {
		while(true) {
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在分发"+tickets--+"学习笔记");
			}
		}
	}
}
public class Thread_test5 {

	public static void main(String[] args) {
		TicketWindow2 tW=new TicketWindow2();
		new Thread(tW, "第1位老师").start();
		new Thread(tW, "第2位老师").start();
		new Thread(tW, "第3位老师").start();
	

	}

}
