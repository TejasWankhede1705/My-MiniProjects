package com.code;

public class Date implements PrintTable{

	private int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

	@Override
	public void print(){
		System.out.println("--date classs print method----");
		
	}

	
	
	
}



