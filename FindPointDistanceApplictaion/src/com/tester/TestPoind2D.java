package com.tester;
import com.code.Point2D; 
public class TestPoind2D {

	public static void main(String[] args) {
		
		Point2D point1 = new Point2D(3,2);
		System.out.println(point1);
		
		
		Point2D point2 = new Point2D(4, 6);
		System.out.println(point2);
		
		Point2D point3 = new Point2D(4, 6);
		System.out.println(point3);
		
	boolean result =point3.isEqual(point2);
		
		if(result==true) {
			System.out.println("points are egual");
		}else {
			System.out.println("Points are not equal");
		}
	
		double distance = point1.calDistance(point2);
		System.out.println(distance);
	
		System.out.println("----------");
		
	boolean res =	point2.equals(point3);
		System.out.println(res);
	}

	
	
}
