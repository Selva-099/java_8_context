package ds.videos.workout;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTimeAPI {

	public static void main(String[] args) {

		// To identify current date and time
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		// get date, Month, year values
		
		int dateValue = date.getDayOfMonth();
		int monthValue = date.getMonthValue();
		int yearValue = date.getYear();
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		
		System.out.printf("%d-%d-%d %d:%d:%d:%d", dateValue, monthValue, yearValue, h,m,s,n);
		
		// To represent some date and time
		System.out.println();
		LocalDateTime dt = LocalDateTime.of(1998,11,03,00,00);
		System.out.println(dt);
		
		// Get after and before 6 months
		
		System.out.println(dt.plusMonths(6));
		System.out.println(dt.minusMonths(6));
		
		// Period class
		
		LocalDate birthDay = LocalDate.of(1998, 11, 03);
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(birthDay, today);
		System.out.println("Years - "+p.getYears()+" Months "+p.getMonths()+" Days - "+p.getDays());
		
		// Year class
		
		Year y = Year.of(1998);
		if(y.isLeap())
			System.out.println("Yes");
		else
			System.out.println("No");
		
		//// Zone Id & ZonedDateTime
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(la);
		System.out.println(zdt);

	}

}
