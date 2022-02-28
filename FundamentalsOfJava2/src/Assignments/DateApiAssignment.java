package Assignments;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateApiAssignment {

	public static void main(String[] args) {
		
//		Date date = new Date();
//		
//		System.out.println(date.getMonth());
//		System.out.println(date.getDate());
//		System.out.println(date.getTime());
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		System.out.println(calendar.getTime());

	}

}
