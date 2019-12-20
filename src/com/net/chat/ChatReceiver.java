package com.net.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver implements Runnable  {
	private DatagramSocket server;
	public ChatReceiver(DatagramSocket server) {
		this.server=server;
	}

	@Override
	public void run() {
		byte[] zjsz=new byte[1024];
		DatagramPacket dp=new DatagramPacket(zjsz, zjsz.length);
		System.out.println("等待数据接收......");
		while(true) {
			try {
				server.receive(dp);
				String neirong=new String(dp.getData(),"UTF-8");
				System.out.println("来自"+dp.getAddress().getHostAddress()+"的信息:"+neirong);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
