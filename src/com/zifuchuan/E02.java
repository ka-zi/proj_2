package com.zifuchuan;

public class E02 {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		System.out.println("数组a的长度是:"+a.length);
		String s="abcabcbacdba.txt";
		
		System.out.println("字符串的长度为:"+s.length());
		System.out.println("字符串中的第一个字符:"+s.charAt(0));
		System.out.println("字符c第一次出现的位置:"+s.indexOf('c'));
		System.out.println("字符c最后一次出现的位置:"+s.lastIndexOf('c'));
		System.out.println("子字符串第一次出现的位置:"+s.indexOf("ab"));
		System.out.println("子字符串最后一次出现的位置:"+s.lastIndexOf("ab"));
	}
}