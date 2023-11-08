package com.test;

import java.util.Map;
import java.util.Scanner;
import static IOutils.PateintPoupulate.populatedata;
import static IOutils.ReadWrite.readFromBinary;
import static IOutils.ReadWrite.storeToBinary;
import static com.validation.PatientValidation.*;
import com.core.Pateint;
import com.core.RoomType;

public class TestPateient {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			boolean flag = false;
			Map<Integer, Pateint> map =  populatedata();
			
			System.out.println("2.1 add patient records.\r\n"
					+ "2.2 display all the patients.\r\n"
					+ "2.3 display all the patient who has annualIncome < 30000 then they can applicable for ”Rajeev Gandhi Yojana”. \r\n"
					+ "2.4 display all the patient details of room type chosen from the user.\r\n"
					+ "2.5 Remove all the patient who has disease “Diabetese”.    \r\n"
					+ "2.6 Change the roomType of a patient who is from “ICU” to SPECIAL room.\r\n"
					+ "2.7 display all the patients who’s age  >75.\r\n"
					+ "2.8 Sort the patients based on gender.\r\n"
					+ "");
			
			while (flag != true) {
				try {
					System.out.println("Enter Choice ... ");
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter Sereal no :");
						int serNo = sc.nextInt();
						System.out.println("Enter Name :");
						String Name = sc.next();
						System.out.println("Enter Age :");
						int age = sc.nextInt();
						System.out.println("Enter gender :");
						String gender = sc.next();
						System.out.println("Enter Address:");
						String address = sc.next();
						System.out.println("Enter phone no :");
						String phone = sc.next();
						System.out.println("Enter disease");
						String disease = sc.next();
						System.out.println("submit bill amount :");
						double bill = sc.nextDouble();
						System.out.println("Annual inclome : ");
						double annualIncome = sc.nextDouble();
						RoomType rm = RoomType.valueOf(sc.next().toUpperCase());
						Pateint pateint = new Pateint(serNo, Name, age, gender, address, phone, disease, bill, annualIncome, rm);
						map.put(pateint.getSerialNo(), pateint);
						
						break;
					case 2:
					//	"2.2 display all the patients.\r\n"
						System.out.println("Patients Details Are : ");
						map.values()
						.stream()
						.forEach(p->System.out.println(p));
						break;
						
					case 3:
				//"2.3 display all the patient who has annualIncome < 30000
				//then they can applicable for ”Rajeev Gandhi Yojana”. \r\n"
						System.out.println("Patients which are Applicable for Rajeev Gandhi Yojna Are:");
						map.values()
						.stream()
						.filter(p->p.getAnnualIncome()<3000)
						.forEach(p->System.out.println(p));
						break;
					case 4:
						
					//"2.4 display all the patient details of room type chosen from the user.
						System.out.println("Rnter room type : ");
						RoomType room = RoomType.valueOf(sc.next().toUpperCase());
						map.values()
						.stream()
						.filter(p-> p.getType()==room).forEach(pat->System.out.println(pat));
						
						
						break;
					case 5:
						//"2.5 Remove all the patient who has disease “Diabetese”.
						map.values()
						.removeIf(p-> p.getDisease().equals("TB"));
						System.out.println("removed");
						break;
					case 6:
						//"2.6 Change the roomType of a patient who is from “ICU” to SPECIAL room.\r\n"
						
						
						RoomType room2 = RoomType.ICU;
						RoomType room1= RoomType.SPECIAL; 
						map.values()
						.stream()
						.filter(p->p.getType()==room2)
						.peek(p->p.setType(room1))
						.forEach(p->System.out.println(p));
						break;
					case 7:
						//"2.7 display all the patients who’s age  >75.\r\n"
						System.out.println("Patient who is Above 75 Years..");
						map.values()
						.stream()
						.filter(p->p.getAge()>75)
						.forEach(p->System.out.println(p));
						break;
					case 8:
						//"2.8 Sort the patients based on gender.\r\n"
						map.values()
						.stream()
						.sorted((p1,p2)->p1.getGender().compareTo(p2.getGender()))
						.forEach(p->System.out.println(p));
						
						break;
					case 0:
						
						flag = true;
						System.out.println("THankYOu.....!!!!!!!!!");
						break;
						
					}
				} catch (Exception e) {
					System.out.println(e);
				}

			}
		}

	}
}
