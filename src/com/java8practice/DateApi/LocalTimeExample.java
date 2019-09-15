package com.java8practice.DateApi;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
	
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("LocalTime : "+localTime);
		
		LocalTime localTime_1 = LocalTime.of(23, 33);
		System.out.println("LocalTime_1 : "+localTime_1);
		
		LocalTime localTime_2 = LocalTime.of(23, 33,33);
		System.out.println("LocalTime_2 : "+localTime_2);
		
		LocalTime localTime_3 = LocalTime.of(23, 33,33,999909909);
		System.out.println("LocalTime_3 : "+localTime_3);
		
		int getHours = localTime.getHour();
		System.out.println("getHours : "+getHours);
		
		System.out.println("getMinutes : "+localTime.getMinute());
		
		System.out.println("ChronoField : "+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		
		System.out.println("Second of day : "+localTime.toSecondOfDay());
		
		System.out.println("Minus Hour of day : "+localTime.minusHours(1));
		
		System.out.println("Minus Hour of day using ChronoUnit: "+localTime.minus(2, ChronoUnit.HOURS));
		System.out.println("Minus Hour of day using ChronoField: "+localTime.with(ChronoField.CLOCK_HOUR_OF_DAY,22));
		
		System.out.println("Plus Minutes: "+localTime.plusMinutes(30));
		
		System.out.println("With Hours: "+localTime.withHour(10));
	}

}
