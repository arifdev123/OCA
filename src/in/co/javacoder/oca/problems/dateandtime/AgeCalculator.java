package in.co.javacoder.oca.problems.dateandtime;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args) {
		
		System.out.println(calculateAge(LocalDate.parse("1990-09-10")));
		
		System.out.println(whoIsElder(LocalDate.parse("1987-09-10"),LocalDate.parse("1988-09-10")));

	}
	
	public static  int whoIsElder(LocalDate dob1, LocalDate dob2) {
		
		/*
		 * if(calculate(dob1) > calculate(dob2)) { return 1; } else if(calculate(dob1) <
		 * calculate(dob2)) { return 2; } else if(calculate(dob1) == calculate(dob2)) {
		 * return 0; }
		 */
		
		return -1;
	}
	
	
	public static int calculateAge(LocalDate dateOfBirth) {
		
		int ageCounter = 0;
		
		Period year = Period.ofYears(1);
		LocalDate tempDate = dateOfBirth;
		LocalDate today = LocalDate.now();
		while(tempDate.isBefore(today)) {
			ageCounter++;
			tempDate = tempDate.plus(year);
		}
		
		return ageCounter;
	}

}
