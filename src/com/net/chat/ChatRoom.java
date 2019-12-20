package com.net.chat;

import java.net.DatagramSocket;

//聊天程序入口
public class ChatRoom {

	public static void main(String[] args) throws Exception {
		
			DatagramSocket sender_socket=new DatagramSocket(5000);
			DatagramSocket receiver_socket=new DatagramSocket(3000);
			new Thread(new ChatReceiver(receiver_socket),"接受服务").start();
			new Thread(new ChatSend1(sender_socket,3000),"发送服务").start();

	}

}
