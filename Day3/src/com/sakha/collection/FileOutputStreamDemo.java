package com.sakha.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo=null;
		byte[] data=new byte[1000];
		String str="writing this to file";
		fo=new FileOutputStream("D:\\workspace\\Day3\\src\\com\\sakha\\collection\\Untitled 1");
		data=str.getBytes();
		fo.write(data);
		System.out.println("success");
		
		
//		FileInputStream fin = new FileInputStream("D:/outputstream.txt");
//		StringBuffer content = new StringBuffer();
//		int ch;
//		while ((ch=fin.read()) != -1) {
//			content.append((char)ch);
//		}
//		System.out.println(content);
	}
}
