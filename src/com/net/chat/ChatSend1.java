package com.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSend1 implements Runnable {
	private DatagramSocket client;
	private int targetPort;
	public ChatSend1(DatagramSocket client,int targetPort) {
		this.client=client;
		this.targetPort=targetPort;
	}
	@Override
	public void run() {
		try {
			Scanner sc=new Scanner(System.in);
			while (true) {
				System.out.println("请输入要发送的信息:");
				String data=sc.nextLine();
				byte[] hcqsz=data.getBytes("UTF-8");
				System.out.println("请输入要发送的ip地址:");
				String ip=sc.nextLine();
				DatagramPacket packet=new DatagramPacket(hcqsz,hcqsz.length,InetAddress.getByName("10.2.103."+ip),targetPort);
				client.send(packet);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
