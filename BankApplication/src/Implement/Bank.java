package Implement;

public class Bank {

	private int accountNo;
	private String customerName;
	private double balance;
	public Bank(int accountNo, String customerName, double balance) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.balance = balance;
	}
	public Bank() {
		super();
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	
	public String toString() {
		return "AccNo:"+accountNo+"  "+"Name:"+customerName+"  "+"Balance:"+balance;
	}
	
}
