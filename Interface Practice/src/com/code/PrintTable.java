package com.code;
@FunctionalInterface
public interface PrintTable {

	public void print();
	
	default void show() {
		
		System.out.println("*****************show method---------");
	};
	
}
