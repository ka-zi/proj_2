package com.net;
import java.net.InetAddress;
public class Net_test1 {

	public static void main(String[] args) throws Exception {
		//获取主机InetAddress对象
		InetAddress localAddress=InetAddress.getLocalHost();
		//获取主机名为"www.itcast.cn"的InetAddress对象
		InetAddress remoteAddress=InetAddress.getByName("www.itcast.cn");
		System.out.println("本机的iP地址:"+localAddress.getHostAddress());
		System.out.println("itcast的ip地址"+remoteAddress.getHostAddress());
		System.out.println("3秒内是否可以访问"+remoteAddress.isReachable(3000));
		System.out.println("itcast的主机名为:"+remoteAddress.getHostName());

	}

}
