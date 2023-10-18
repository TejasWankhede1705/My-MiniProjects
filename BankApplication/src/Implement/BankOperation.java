package Implement;
import Implement.Bank;
public class BankOperation {

	
	public static void withdraw(Bank obj, double amount) {
		obj.setBalance(obj.getBalance()-amount);
		System.out.println("After withdra Balance :"+obj.getBalance());
	}
	
	public static void deposite(Bank obj,double amaount) {
		obj.setBalance(obj.getBalance()+amaount);
		System.out.println("After Deposite Balance :"+obj.getBalance());
	}
	
}
