package com.validation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.core.Customer;
import com.core.ServicePlan;
import com.customException.InputInvalidException;



public class UserLoginValidation {

	public static Customer userloginValidation(String email,String password,java.util.List<Customer> customers) throws InputInvalidException {
		
		Customer customer1 = new Customer(email) ;
		
		int index = customers.indexOf(customer1);
		
		if(customers.indexOf(customer1)==-1 ) {
			throw new InputInvalidException("No email found");
		}
		Customer c = customers.get(index);
		
		if(c.getPassword().equals(password)) { 
			System.out.println("SignIn successfulyy...!!!");
			return c;
		}
			throw new InputInvalidException("Password don't match");
	}
	
	public static List<Customer> sampleData(){
		
		java.util.List<Customer> clist = new ArrayList<>();
		
		clist.add(new Customer("Tejas", "Wankhede", "tejas1122", "1122", 2000,LocalDate.parse("2000-05-17"), ServicePlan.GOLD,LocalDate.parse("2023-06-17")));
		clist.add(new Customer("Sarang", "kakirwar", "sarang123", "123", 5000,LocalDate.parse("2000-08-26"), ServicePlan.PLATINUM,LocalDate.parse("2023-07-17")));
		clist.add(new Customer("Rushi", "Ghodke", "rushi1111", "1111", 1000,LocalDate.parse("1998-02-14"), ServicePlan.SILVER,LocalDate.parse("2022-10-29")));
		clist.add(new Customer("Himu", "Ghadge", "himu0000", "0000", 10000,LocalDate.parse("1999-04-23"), ServicePlan.DIAMOND,LocalDate.parse("2023-03-25")));
		clist.add(new Customer("Tushar", "Rane", "tushar5555", "5555", 2000,LocalDate.parse("2000-05-17"), ServicePlan.GOLD,LocalDate.parse("2023-02-06")));
		clist.add(new Customer("Ram", "Lakhan", "ram123", "123", 5000,LocalDate.parse("2000-05-17"), ServicePlan.DIAMOND,LocalDate.parse("2023-04-15")));

		return clist;
	}

}

