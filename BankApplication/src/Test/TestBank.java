package Test;
import Implement.Bank;
import Implement.BankOperation;
import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		
		Bank [] barr = new Bank[2];
		
		int choice =0  ;
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("1.Add customer 2.Show details    3.Show Balance  4.withdraw   5.Deposite  ");
			System.out.println("Select the Operation:");
			System.out.println();
			choice = sc.nextInt();
			
		switch(choice){

		case 1:
			if(index<barr.length) {
				System.out.println("Enter AccountNo - Name - Balance");
				Bank obj = new Bank(sc.nextInt(),sc.next(),sc.nextDouble());
				barr[index]= obj;
				index++;
				
			}else {
				System.out.println("No more Space AVailable");
			}
			break;
		case 2:
			for(Bank bObj : barr) {
				System.out.println(bObj);
			}
			break;
			
		case 3:
			//add function
			System.out.println("Enter accno to see Balance");
			int accno = sc.nextInt();
			for(Bank b : barr){
			if(b!=null) {
			if(b.getAccountNo()== accno) {
				System.out.println("Balance:"+b.getBalance());
				break;
			}
		}
	}
			break;
			
		case 4:
			System.out.println("Enter your Accountno :");
			int acountno = sc.nextInt();
			for(Bank b:barr) {
				if(b!=null) {
					if(b.getAccountNo()==acountno) {
					//	BankOperation b1 = new BankOperation();
						System.out.println("enter amount to withdraw:");
						BankOperation.withdraw(b, sc.nextDouble());//calling static method using className
						//no need to create object
						break ;
					}
				}
			}
			break;
		
		case 5:
			System.out.println("Enter your Account no");
			int acno =sc.nextInt();
			for(Bank b : barr) {
				if(b!=null) {
					if(b.getAccountNo()==acno) {
						System.out.println("Enter amount to Deposite :");
						BankOperation.deposite(b,sc.nextDouble());
						break;
					}
				}
			}
			
			break;
			
		default :
			System.out.println("Enter valid Input");
			break;
		
		}
			
		}while(choice!=6);

	}

}
