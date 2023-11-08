package com.validation;

import java.util.HashMap;
import java.util.Map;

import com.Exception.InvalidPatientException;
import com.core.Pateint;
import com.core.RoomType;

public class PatientValidation {

	/*1.2: Add required parsing / validation methods n custom exceptions for:
		1.2.1 roomType 
		1.2.2 admitDate (note: admitDate must be equal to today’s date.),
		1.2.3 bill should be match with enum amount.


		1.3: It should store and restore patient records in a binary file using object streams.
		(note: Accept the file name from user.)
*/
	
	public static RoomType validateroomType(String roomType) {
		
		return RoomType.valueOf(roomType.toUpperCase());
		
	}
	
	public static void validateBill(RoomType roomType,double amount) throws InvalidPatientException {
		
		if(roomType.getRoomCharges()!=amount)
			throw new InvalidPatientException("Bill amount dosen't match..!!");
		
	}
	
	
	public static Map<Integer, Pateint> validatepatient(int serialNo, String patientName, int age, String gender, String address, String phoneNo,
			String disease, double bill, double annualIncome, String type , Map<Integer, Pateint> hm) throws InvalidPatientException{
		
		RoomType validateroomType = validateroomType(type);
		validateBill(validateroomType, bill);
		
		//Pateint pobj = new Pateint(serialNo, patientName, age, gender, address, phoneNo, disease, bill, annualIncome, validateroomType);
		Pateint p = new Pateint(serialNo);
		Map<Integer, Pateint> map = new HashMap<>();
		
		return (Map<Integer, Pateint>) map.put(p.getSerialNo(), new Pateint(serialNo, patientName, age, gender, address, phoneNo, disease, bill, annualIncome, validateroomType)); 
	}
 	
}
