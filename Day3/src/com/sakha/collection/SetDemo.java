package com.sakha.collection;

import java.util.HashSet;
import java.util.Scanner;

public class SetDemo {
	

	// private String[] countries = new String[5];
	// int i;
	//
	// void names() {
	// System.out.println("enter 5 countries ");
	//
	// for (i = 0; i < 5; i++) {
	// Scanner scan = new Scanner(System.in);
	// countries[i] = scan.nextLine();
	// }
	// HashSet hs = new HashSet();
	// for (int i = 0; i < countries.length; i++) {
	// hs.add(countries[i]);
	// }
	// System.out.println(hs);
	// }
	//
	// public static void main(String[] args) {
	// SetDemo obj1 = new SetDemo();
	// obj1.names();
	//
	// }

	public HashSet countries() {
		HashSet hs1 = new HashSet();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 country names ");
		for (int i = 0; i < 5; i++) {
			hs1.add(scan.next());
		}
		return hs1;
	}
	
	public HashSet hs1to10(){
		 HashSet hs1= new HashSet();
		for(int i=1;i<=10;i++){
			hs1.add(i);
		}
		return hs1;
	}
	public HashSet hs1to15(){
		 HashSet hs2= new HashSet();
		 hs2=hs1to10();
		for(int i=11;i<=15;i++){
			hs2.add(i);
		}
		return hs2;
	}

	public static void main(String[] args) {
		SetDemo obj1 = new SetDemo();
		System.out.println(obj1.countries());
		System.out.println(obj1.hs1to10());
		System.out.println(obj1.hs1to15());
		
	}

}
