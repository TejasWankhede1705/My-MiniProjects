//
//Lab 5. Coding assignment
//
//5.1 Create a class Point2D ,    : for representing a point in x-y co-ordinate system.
//
//5.2 Create a parameterized constructor to init x & y co-ords. ---done
//
//5.3 Add a method to return string form of  point's x & y co-ords
//Hint :  public String toString()) -----done
//5.4 Add isEqual method to Point2D class :a boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.
//eg : public boolean isEqual(Point2D anotherPoint) --- done
//{
// .......
//}
//eg : p1.isEqual(p2)
//
//
//5.5 Add calculateDistance method to calculate distance between current point and specified point & return the distance to the caller.
//Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
//eg : public double calculateDistance(Point2D anotherPoint)
//{
//  Math.sqrt(.....);
//}
//


package com.code;
import java.lang.Math;
public class Point2D {

	private int x;
	private int y;
	public Point2D(int x, int y) {
		super();
		//System.out.println("prameterized constructpr will get called");
		this.x = x;
		this.y = y;
	}
//	public Point2D() {
//		super();
//		System.out.println("default constructor get called...!");
//	}
//	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]"; // pt1--->sysout(pt1);
	}
	//5.5 Add calculateDistance method to calculate distance between current point and specified point & return the distance to the caller.
	//Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
	//eg : public double calculateDistance(Point2D anotherPoint)
	//{
	//  Math.sqrt(.....);
	//}
	//
	
	// Point2d p1 = new 
	//p1 p2
	//p1.isequal()
	
//	Point2D point2 = new Point2D(4, 6);
//	System.out.println(point2);
//	
//	Point2D point3 = new Point2D(4, 6);
//	System.out.println(point3);
//	
//boolean result =point3.isEqual(point2);

	
	// point2.isEqual(pointp3)
	
	public boolean isEqual(Point2D obj) {
		if(this.x == obj.x && this.y == obj.y)
		return true;
		else{
		return false;
		}
		}
		
	public double calDistance(Point2D obj) {
		
		double distance = Math.sqrt(Math.pow(this.x-obj.x, 2)+Math.pow(this.y-obj.y, 2));
		
		return distance;
	
	
	}
	
}


















