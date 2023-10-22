package com.code;

public class Employee implements PrintTable{

	private int empid;
	private String empName;
	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + "]";
	}
	@Override
	public void print() {
	
		System.out.println("---employee print method----");
		
	}
	
	
	
	
	
}
