import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class testdate {

	public static void main(String[] args) {
		System.out.println("enter date");
		Scanner sc = new Scanner(System.in);
		
		LocalDate  regdate = LocalDate.parse(sc.next());
		System.out.println(regdate);
		
		
	System.out.println(Period.between(regdate, LocalDate.now()));
		
		System.out.println(Period.between(regdate, LocalDate.now()).getMonths());
		
		
	}

}
