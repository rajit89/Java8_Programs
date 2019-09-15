package com.java8practice.DateApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
	
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : "+localDate);
		
		LocalDate localDate1 = LocalDate.of(2019, 11, 14);
		System.out.println("localDate : "+localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime : "+localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime : "+localDateTime);
		
		LocalDate localDateWithMonthYear = LocalDate.of(2019, 9,14);
		System.out.println("localDateWithMonthYear : "+localDateWithMonthYear);
		
		LocalDate localDateWithMonthYearWithValue = LocalDate.of(2019, Month.SEPTEMBER, 14);
		System.out.println("localDateWithMonthYear : "+localDateWithMonthYearWithValue);
		
		System.out.println("Month Name : "+localDate.getMonth());
		System.out.println("Month Value : "+localDate.getMonthValue());
		
		System.out.println("DayOfWeek : "+localDate.getDayOfWeek());
		System.out.println("DayOfMonth : "+localDate.getDayOfMonth());
		
		System.out.println("ChronoField...  "+localDate.get(ChronoField.DAY_OF_MONTH));
		
		System.out.println("PlusDay : "+localDate.plusDays(2));
		
		System.out.println("PlusMonths : "+localDate.plusMonths(2));
		
		System.out.println("MinusMonths : "+localDate.minusMonths(2));
		
		System.out.println("With ChronoField Year : "+localDate.with(ChronoField.YEAR, 2020));
		
		System.out.println("With TemporalAdjusters : "+localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		
		System.out.println("************************************************");
		
		//System.out.println("ChronoUnit : "+localDate.minus(1,ChronoUnit.MINUTES));
		
		System.out.println("ChronoUnit Supported YES/NO: "+localDate.isSupported(ChronoUnit.MINUTES));
		
		System.out.println("ChronoUnit : "+localDate.minus(1,ChronoUnit.YEARS));
		
		System.out.println("Is Equal Test : "+localDate.isEqual(localDate1));
		
		System.out.println("Is Before Test : "+localDate.isBefore(localDate1));
		
		System.out.println("Is After Test : "+localDate.isAfter(localDate1));
		
	}

}
