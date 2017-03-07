package com.sakha.collection;

public class GenericsDemo2<E> {

	private E width;
	
	public static void main(String[] args) {
		GenericsDemo2<Float> g=new GenericsDemo2<Float>();
		System.out.println(g.display(5f));
	}

	public E display(E width) {
		
		return width;
	}
	
	
}
