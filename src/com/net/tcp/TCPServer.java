package com.net.tcp;


import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		ServerSocket fwqtjz=new ServerSocket(8899);
		while(true) {
		//通过服务器套接字获取客户端套接字
		Socket kndtjz=fwqtjz.accept();
		Thread thread=new Thread(()->{
			try {
		//获取客户端的端口号
		int port=kndtjz.getPort();
		System.out.println("与端口号为"+port+"的客户端连接成功");
		//要往客户端发送数据，必须通过所获得的客户端套接字创建输出流
		OutputStream os=kndtjz.getOutputStream();
		String s="你好,来自10.2.103.31这个tcp服务器的问候";
		byte[] b=s.getBytes();
		os.write(b);
		os.close();
		kndtjz.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
		});
		thread.start();
}
}
}