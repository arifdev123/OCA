package in.co.javacoder.oca.datetiming;

import java.time.LocalDate;
import java.time.Month;

public class PeriodDemo {

	public static void main(String[] args) {
			System.out.println("With Period class");
			LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
			LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
			
			performAnimalEnrichment(start, end);
	}
	
	public static void performAnimalEnrichment(
			LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while(upTo.isBefore(end)) {   // check if still before end
			System.out.println("Give a new Toy : " + upTo);
			upTo = upTo.plusMonths(1); // add a month
		}
	}

}
