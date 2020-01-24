package in.co.javacoder.oca.datetiming;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class PeriodDemoTwo {

	public static void main(String[] args) {
		
		// Period is a day or more of time.
		
		System.out.println("With Period class");
			LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
			LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
			Period period = Period.ofMonths(1);
			performAnimalEnrichment(start, end, period);
			
			// Ways to create period class
			
			Period annually = Period.ofYears(1);
			Period quarterly = Period.ofMonths(3);
			Period everyThreeWeeks = Period.ofWeeks(3);
			Period everyOtherDay = Period.ofDays(2);
			Period everyYearAndWeek = Period.of(1, 0, 7);
			
			Period halfyearly = Period.ofMonths(6);
			Period weekly = Period.ofWeeks(1);
			Period fortnightly = Period.ofWeeks(2);
			
			
		/* Method chaining is not possible when creating a period. */
		
			Period wrongPeriod = Period.ofYears(1).ofWeeks(1);
			
			// The above one looks like the everyYearAndWeek but it is not. Only the last method is used i.e ofWeeks(1).
			
			// Another tricky Part : 
			
			Period wrong = Period.ofYears(1);
			wrong = Period.ofWeeks(7);
			
			// Period won't work with time object
			
			LocalTime time = LocalTime.of(6, 15);
			System.out.println(time.plus(period));
			
	}
	
	public static void performAnimalEnrichment(
		LocalDate start, LocalDate end, Period period) {
		LocalDate upTo = start;
		while(upTo.isBefore(end)) {   // check if still before end
			System.out.println("Give a new Toy : " + upTo);
			upTo = upTo.plus(period); // add a month
		}
	}
}
