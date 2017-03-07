package com.sakha.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;

public class GenericsDemo {
	public static void main(String[] args) {
		GenericsDemo obj1=new GenericsDemo();
		System.out.println(obj1.countries());
	}
	
	public ArrayList countries() {
		ArrayList<String> hs1 = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 country names ");
		for (int i = 0; i < 5; i++) {
			hs1.add(scan.next());
		}
		return hs1;
	}
	public HashSet hs1to10(){
		 HashSet<Integer> hs1= new HashSet<Integer>();
		for(int i=1;i<=10;i++){
			hs1.add(i);
		}
		return hs1;
	}
}
