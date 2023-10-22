package com.test;

import com.code.*;

public class TestInteface {
	public static void main(String[] args) {

		PrintTable pobj = () -> {
			System.out.println("--using Lambda function---");
		};

		pobj.print();
		
//		Employee eobj ;
//		if(pobj instanceof PrintTable ) {
//		eobj = (Employee) pobj;
//		eobj.print();
//	
//			}
		
		Employee eobj = new Employee(101, "Tejas");
		eobj.print();
		eobj.show();
		System.out.println(eobj);
		
		Shape sobj = new Shape("circle");
		sobj.print();
		sobj.show();
		System.out.println(sobj);
		
		
		Date dobj = new Date(17, 05, 2000) ;
		dobj.print();
		dobj.show();
		System.out.println(dobj);
		
		
		
//		

		
		//----------------------------------------------------//
		
		
		PrintTable p = new PrintTable() {
			
			@Override
			public void print() {
				System.out.println("--annonymous class print method---");
				
			}
		};
		p.print();
		p.show();
		
	}
//		
		
}
