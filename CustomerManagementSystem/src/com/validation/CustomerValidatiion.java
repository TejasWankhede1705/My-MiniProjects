package com.validation;

import java.time.LocalDate;
import java.util.List;

import com.core.Customer;
import com.core.ServicePlan;
import com.customException.InputInvalidException;


public class CustomerValidatiion {

	public static ServicePlan validPlan(String plan) throws IllegalArgumentException {
		
		return ServicePlan.valueOf(plan.toUpperCase());
	}
	
//
	
	
	
	//ADD a method to validate reg amount with plan
	
	public static void validatePlanAmount(ServicePlan plan , double regAmount) throws InputInvalidException {
		if (plan.getServiceCost()!= regAmount)
			throw new InputInvalidException("Registration amount dosent match");
	}
	
	
	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}
	
	//no dup customers 
//	(i.e if the customer tries to register using existing email , throw exception)
	
	public static void duplicateEmail(String email,java.util.List<Customer> customer) throws InputInvalidException {
	
		Customer newCustomer = new Customer(email);
		if(customer.contains(newCustomer))
			throw new InputInvalidException("email already exist");
	}
	
	
	
	
	
	public static Customer validateInput(String firstName, String lastName, String email,String password, double registrationAmount, LocalDate dob,
			String plan,LocalDate registrationDate, List<Customer> customer)throws IllegalArgumentException,InputInvalidException {
		
		ServicePlan validateplan = validPlan(plan);
		
		
		validatePlanAmount(validateplan, registrationAmount);
		
		 duplicateEmail(email,customer);
		
//		String firstName, String lastName, String email,String password, double registrationAmount, LocalDate dob,
		//ServicePlan plan	
		return new Customer (firstName, lastName, email, password, registrationAmount, dob, validateplan,registrationDate);
		
		
		
	}
	
}
