package in.co.javacoder.oca.datetiming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeDemo {

	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		System.out.println(LocalDate.of(1990, Month.SEPTEMBER, 10));
		System.out.println(LocalDate.of(1990, 9, 10));
		
		
		System.out.println(LocalTime.of(11, 14));
		System.out.println(LocalTime.of(23, 59, 59));
		System.out.println(LocalTime.of(23, 59, 59, 450));
		
		System.out.println(LocalDateTime.of(1990, Month.SEPTEMBER, 10, 23, 59, 59));

		// LocalDate ld = new LocalDate();  // This can not be done as all of its constructors are with private access. Thus, forcing to use static methods.
		
		
		LocalDate doj = LocalDate.of(2016, Month.JANUARY, 11);
		
		// Immutable date objects 
		doj.plusDays(10); // the returned object should be captured in a reference. 
		System.out.println(doj);
		
		// Date Manipulation : Incrementing the day, year and month
		// the below date manipulation methods return the same type of object which contains latest change done. So, method chaining is possible. Method chaining is handy too.
		System.out.println(doj.plusDays(1)  // 2016-01-12
				.plusMonths(12)   			// 2017-01-12
				.plusYears(3)    			// 2020-01-12
				.plusWeeks(2)   			// 2020-01-26
				);
		
		
		System.out.println(doj.minusDays(10) // 2016-01-01
				.minusMonths(3) // 2015-10-01
				.minusYears(1) // 2014-10-01
				.minusWeeks(3) // 2014-09-10
				);
		
	}

}
