package com.java8practice.DateApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
	
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.of(7,20);
		LocalTime localTime_1 = LocalTime.of(8,20);
		
		long output = localTime.until(localTime_1, ChronoUnit.MINUTES);
		System.out.println("Difference in minutes "+output);
		
		Duration duration = Duration.between(localTime, localTime_1);
		System.out.println("Differnce in Hours "+duration.toHours());
		
		System.out.println("Differnce in Minutes "+duration.toMinutes());
		
		LocalDate localDate = LocalDate.now();
		LocalDate localDate_1 = LocalDate.now().plusDays(10);
		
		// It will throw Run time exception not Compile time Exception
		//Duration duration_test = Duration.between(localDate, localDate_1);
	}
}
