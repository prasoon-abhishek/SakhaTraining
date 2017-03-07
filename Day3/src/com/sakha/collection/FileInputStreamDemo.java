package com.sakha.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\workspace\\Day3\\src\\com\\sakha\\collection\\Untitled 1");
		StringBuffer content = new StringBuffer();
		int ch;
		while ((ch=fin.read()) != -1) {
			content.append((char)ch);
		}
		System.out.println(content);

	}

}
