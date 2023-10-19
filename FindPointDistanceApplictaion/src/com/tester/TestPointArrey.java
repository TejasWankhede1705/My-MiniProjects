package com.tester;
import com.code.Point2D;
import java.util.Scanner;
public class TestPointArrey {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Point2D [] parr = new Point2D[5];
	int choice = 0,index =0;
	
	do {
	
		System.out.println("select: 1.show details  2.Add  3.show distance");
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			
			for(Point2D pobj:parr) {
				System.out.println(pobj);
			}
		
		
		break;
		
		case 2:
			if(index<parr.length) {
				
				
					System.out.println("Enter X and Y co - ordinate");
					Point2D pobj = new Point2D(sc.nextInt(), sc.nextInt());
					parr[index]=pobj;
					index++;
				
			}else {
				System.out.println("Arrey is full...!");
			}
		break;
		case 3:
			System.out.println("To calculate distance ");
			System.out.println("Point 1 ->");
			int a = sc.nextInt();
			System.out.println("Point 2 - >");
			int b = sc.nextInt();
			if(parr[a-1] != null && parr[b-1] != null) {
			double distance = parr[a-1].calDistance(parr[b-1]);
			System.out.println(distance);
					break;
		
		}else {
			System.out.println("No point exit at index");
		}
		}
	}while(choice != 4);
	
	
	
	
}
}
