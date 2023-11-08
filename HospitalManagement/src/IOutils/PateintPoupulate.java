package IOutils;

import java.util.HashMap;
import java.util.Map;

import com.core.Pateint;
import com.core.RoomType;

public class PateintPoupulate {
	/*Bill(double), annualIncome(double),roomType ( GENERAL(2000), 
	 * SPECIAL(5000), SEMI-SPECIAL(3000),ICU(7000)).*
	*/
	
	public static Map<Integer, Pateint> populatedata(){
		
		Map<Integer, Pateint> hm = new HashMap<Integer, Pateint>();
		hm.put(101, new Pateint(101, "Tejas", 23, "Male", "Pune", "9370589290","TB", 7000, 350000, RoomType.ICU));
		hm.put(102, new Pateint(102, "Harshal", 23, "Male", "Wardha", "9378888290","Dengue", 7000, 150000, RoomType.ICU));
		hm.put(103, new Pateint(103, "Amit", 23, "Male", "Pune", "9370589880","Maleria", 3000, 200000, RoomType.SEMISPECIAL));
		hm.put(104, new Pateint(104, "Lokesh", 28, "Male", "Jodhpur", "9988667700","Suger", 5000, 250000, RoomType.SPECIAL));
		hm.put(105, new Pateint(105, "Shreyas", 22, "feMale", "Nashik", "0012556622","AIDS", 2000, 25000, RoomType.General));
		hm.put(106, new Pateint(106, "Raju", 89, "Male", "Wardha", "3332556622","Diabitis", 2000, 20000, RoomType.General));
		hm.put(107, new Pateint(107, "Kamala", 80, "feMale", "Nagpur", "001255444","Fracture", 2000, 26000, RoomType.General));
		hm.put(108, new Pateint(108, "Sushma", 55, "feMale", "Nashik", "0012556622","BP", 2000, 20000, RoomType.General));

		
		return hm;
	}
	
}
