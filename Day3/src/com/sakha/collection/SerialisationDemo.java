package com.sakha.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialisationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	Employee emp1=new Employee(123456, "Sakha", 1250000);
	System.out.println("Employee before serialisation "+emp1);
	
	//SErialisation starts
//	FileOutputStream fos=new FileOutputStream("D:\\workspace\\Day3\\src\\"
//			+ "com\\sakha\\collection\\Untitled 1");
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(
			"D:\\workspace\\Day3\\src\\"+ "com\\sakha\\collection\\Untitled 1"));
	oos.writeObject(emp1);
	oos.flush();
	oos.close();
	System.out.println("success");
	//serialisation ends
	
	//DE-serialisation starts
	FileInputStream fis=new FileInputStream("D:\\workspace\\Day3\\src\\com\\sakha\\collection"
			+ "\\Untitled 1");
	ObjectInputStream ois=new ObjectInputStream(fis);
	System.out.println("after deserialisation ");
	System.out.println(ois.readObject());

			
			
	}
}
