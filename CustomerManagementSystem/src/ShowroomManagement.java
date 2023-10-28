import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;


import com.core.*;
import com.validation.CustomerValidatiion;
import com.validation.UserLoginValidation;


public class ShowroomManagement {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			List<Customer> customer = UserLoginValidation.sampleData();

			boolean flag = false;

			while (flag != true) {

				System.out.println("1.Sign up(Create new account)" + "2.Sign in" + " 3.Update password"
						+ " 4.Delete accout" + "5. display all" + " 6. sort on basis of email" + " 7.Sort based on DOB "
						+ " 8.sort based on Dob and lastName" + " 9.login as admin ");
				System.out.println("Enter choice");
				try {
					switch (sc.nextInt()) {

					case 1:
						System.out.println(
								"Enter details:firstName  lastName  email  password  registrationAmount  dob  ServicePlan plan");

						Customer c = CustomerValidatiion.validateInput(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), CustomerValidatiion.parseDate(sc.next()), sc.next(),LocalDate.parse(sc.next()), customer);
						customer.add(c);

						break;
					case 2:
						System.out.println("for Sign in...");
						System.out.println("Enter email and pass");
						UserLoginValidation.userloginValidation(sc.next(), sc.next(), customer);

						break;
					case 3:
						System.out.println("Enter email and password for logIn..");
						Customer c1 = UserLoginValidation.userloginValidation(sc.next(), sc.next(), customer);
						System.out.println("Enter new password ");
						c1.setPassword(sc.next());
						System.out.println("password update sucsessfully......");
						break;

					case 4:
						System.out.println("Enter email and pass to unsubscribe");
						Customer cr = UserLoginValidation.userloginValidation(sc.next(), sc.next(), customer);
						boolean remove = customer.remove(cr);
						if (remove) {
							System.out.println("you have Un-Subscribed..!");
						}
						break;

					case 5:
						for (Customer cust : customer) {
							System.out.println(cust);
						}
						break;
					case 6:
						System.out.println("Sorted lists of customer ....!!!");
						Collections.sort(customer);
						break;
					case 7:
						// for sorting based on DOB custom ordering should be done
						Collections.sort(customer, new Comparator<Customer>() {

							@Override
							public int compare(Customer c1, Customer c2) {
								return c1.getDob().compareTo(c2.getDob());

							}
						});
						break;
					case 8:
						//sorting based on Dob and last name
						Collections.sort(customer,new Comparator<Customer>() {

							@Override
							public int compare(Customer c1, Customer c2) {
								int ret = c1.getDob().compareTo(c2.getDob());
								//if two dates are same then on besis on last name
								if(ret==0) {
									return c1.getLastName().compareTo(c2.getLastName());
								}
								
								return ret;
							}
							
						});
						break;
					case 9:
						System.out.println("you are now admin...!!");
						int ch=0;
						do {
							System.out.println("1.to print full names " + " 2.see registration dates " +
						" 3.Customers who have pending subscription" + "4.Remove Customer who have pending from 5 months" + " 5.to exit ");
							System.out.println("select choice");
							switch (ch=sc.nextInt()) {
							case 1:
								for(Customer clist : customer) {
									System.out.println(clist.getFirstName()+" "+clist.getLastName() );
								}
								break;
							case 2:
								
								for(Customer clist : customer) {
									System.out.println(clist.getFirstName() +"  "+clist.getLastName()+"  "+" last REgistration Date: "+clist.getRegistrationDate());
								}
								break;
							case 3:
								//display complete names of the customers , who have not paid the subscription (reg amount) ,
								//for last 3 months ?
								System.out.println("Customer who have not paid subsrobtion from last 3 months ..!!");
								System.out.println();
								for(Customer clist: customer) {
									int months= Period.between(clist.getRegistrationDate(), LocalDate.now()).getMonths();
									if(months>=3) {
										System.out.println(clist.getFirstName() +"  "+clist.getLastName()+"  "+" last REgistration Date: "+clist.getRegistrationDate());
									}
								}
								break;
							case 4:
								
								Iterator<Customer>custItr = customer.iterator();
								while(custItr.hasNext()) {
									//LocalDate d = custItr.next().getRegistrationAmount();
									//Period p = Period.between(d, LocalDate.now());
								int month =	Period.between(custItr.next().getRegistrationDate(),LocalDate.now()).getMonths() ;
								//System.out.println(month);
								if(month>=6) {
									custItr.remove();
								}
								
								
								}
								System.out.println("Customer removed...!!");
								break;
								
							case 5:
								System.out.println("Thank you admin");
								break;
								
							
							
							}
						}while(ch!=5);
						
					break;
					case 0:
						flag = true;
						break;
					}

				} catch (Exception e) {
					System.out.println(e);
					// System.out.println(e.getStackTrace());
				}

			}
		}
	}

}
