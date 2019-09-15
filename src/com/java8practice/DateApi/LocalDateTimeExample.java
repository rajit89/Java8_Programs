package com.java8practice.DateApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
	
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime : "+localDateTime);
		
		LocalDateTime localDateTime_1 = LocalDateTime.of(2019, 9, 15, 7, 30);
		System.out.println("localDateTime_1 : "+localDateTime_1);
		
		LocalDateTime localDateTime_2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("localDateTime_2 : "+localDateTime_2);
		
		System.out.println("localDateTime gethours : "+localDateTime.getHour());
		
		System.out.println("localDateTime getMinute : "+localDateTime.getMinute());
		
		System.out.println("localDateTime getMonthValue : "+localDateTime.getMonthValue());
		
		System.out.println("localDateTime with chronofield : "+localDateTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		
		System.out.println("DAY_OF_MONTH with chronofield : "+localDateTime.get(ChronoField.DAY_OF_MONTH));
		
		LocalDate localDate = LocalDate.of(2019, 9, 15);
		System.out.println("LocalDate :"+localDate);
		
		System.out.println("LocalDate at time :"+localDate.atTime(23, 33));
		
		LocalTime localTime = LocalTime.of(22, 15);
		System.out.println("LocalTime at date :"+localTime.atDate(localDate));
	}

}
