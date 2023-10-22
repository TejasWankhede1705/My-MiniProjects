package com.code;

public class Shape implements PrintTable {

	private String name;

	public Shape(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}

	@Override
	public void print() {
		System.out.println("---inside shape display method------");
		
	}
	
	
	
	
	
}
