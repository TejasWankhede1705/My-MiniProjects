//import java.util.Scanner;
//
//import com.core.Customer;
//import com.validation.*;
//
//public class TestCustomer {
//public static void main(String[] args) {
//	
//	
//	
//	try(Scanner sc = new Scanner(System.in)){
//		
//		System.out.println("Enter customer detail: firstName ,lastName, email ,registrationAmount, dob(yr-mon-day),\r\n" +"ServicePlan plan");
//		
//	Customer cust1   =	CustomerValidatiion.validateInput(sc.next(), sc.next(), sc.next(), sc.nextDouble(),CustomerValidatiion.parseDate(sc.next()), sc.next());
//		
//		System.out.println(cust1);
//
//		System.out.println("Enter customer detail: firstName ,lastName, email ,registrationAmount, dob(yr-mon-day),\r\n" + "ServicePlan plan");
//		
//		Customer cust2 =	CustomerValidatiion.validateInput(sc.next(), sc.next(), sc.next(), sc.nextDouble(),CustomerValidatiion.parseDate(sc.next()), sc.next());
//		
//	System.out.println(cust2);
//		
//	}catch (Exception e) {
//		System.out.println(e);
//	}
//}
//}
