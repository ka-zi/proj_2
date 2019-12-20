package com.net.tcp;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;


public class TCPClient {

	public static void main(String[] args) throws IOException {
		//创建客户端套接字，参数是服务器的地址和服务器开放的端口号，连接服务器
		Socket kndtjz=new Socket("10.2.103.31",8899);
		//客户端接受数据，通过套接字获取输入流
		InputStream is=kndtjz.getInputStream();
		byte[] zjhc=new byte[1024];
		int b=is.read(zjhc);
		while(b!=-1) {
			System.out.println(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
			is.close();
			kndtjz.close();
	}

}
