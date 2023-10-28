package com.core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {

	static {
		//autoincrement the id
		
		idCounter = 100;
	}
	
	
	private static int idCounter;
	private int customerid;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private LocalDate registrationDate;
	public Customer(String firstName, String lastName, String email,String password, double registrationAmount, LocalDate dob,
			ServicePlan plan,LocalDate registrationDate) {
		super();
		this.customerid = idCounter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
		this.registrationDate=registrationDate;
	}
	
	
	

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}




	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}




	public Customer(String email) {
		super();
		this.email = email;
	}




	public static int getIdCounter() {
		return idCounter;
	}




	public static void setIdCounter(int idCounter) {
		Customer.idCounter = idCounter;
	}




	public int getCustomerid() {
		return customerid;
	}




	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public double getRegistrationAmount() {
		return registrationAmount;
	}




	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}




	public LocalDate getDob() {
		return dob;
	}




	public void setDob(LocalDate dob) {
		this.dob = dob;
	}




	public ServicePlan getPlan() {
		return plan;
	}




	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}




	@Override
	public String toString() {
		return "Customer [ customerID" + customerid + "firstName=" + firstName + "  lastName= " + lastName + "  email=" + email
				+ " registrationAmount= " + registrationAmount + " dob= " + dob + "  plan= " + plan +  " Register date = "+registrationDate +"]";
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Customer) {
			Customer cobj = (Customer)obj;
			return this.email.equals(cobj.email);
		}
		return false;
		
	}




	@Override
	public int compareTo(Customer anotherCustomer) {
		
		return this.email.compareTo(anotherCustomer.email);
	}

	


}
