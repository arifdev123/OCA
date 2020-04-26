package in.co.javacoder.oca.datetiming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 6);
		System.out.println("Day of Year : "+date.getDayOfYear());
		System.out.println("Day of Month : "+date.getDayOfMonth());
		System.out.println("Month : "+date.getMonth());
		System.out.println("Day of Week : "+date.getDayOfWeek());
		System.out.println("Month Value : "+date.getMonthValue());
		System.out.println("Era : "+date.getEra());
		
		LocalTime time = LocalTime.of(16,24,45);
		
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		
		System.out.println(date.format(DateTimeFormatter.ISO_ORDINAL_DATE));  // 2020-037 - yyyy-dayofyear
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));  // 2020-02-06
		System.out.println(date.format(DateTimeFormatter.ISO_DATE));  // 2020-02-06
		//System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE)); // 20200206
		System.out.println(date.format(DateTimeFormatter.ISO_WEEK_DATE));  // 2020-W06-4 yyyy-w<week of year>-dayofweek
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd.MM.uuuu")));  // 06.02.2020
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/uuuu")));  // 06/02/2020
		
		DateTimeFormatter dateTimeFormatter = null;
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(dateTime);
		
		System.out.println(dateTimeFormatter.format(dateTime));
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(dateTimeFormatter.format(dateTime));
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(dateTimeFormatter.format(dateTime));
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(dateTimeFormatter.format(dateTime));
		
		
		//
		
		time = LocalTime.of(12,02,40);
		date = LocalDate.of(2017, Month.FEBRUARY, 6);
		dateTime = LocalDateTime.of(date, time);
		
		//dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
		//System.out.println(dateTime);
		
		//System.out.println(dateTimeFormatter.format(dateTime));
		
		//dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
		//System.out.println(dateTimeFormatter.format(dateTime));
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		System.out.println(dateTimeFormatter.format(dateTime));
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(dateTimeFormatter.format(dateTime));
		
		
		
		
		

	}

}
