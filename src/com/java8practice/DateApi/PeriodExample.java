package com.java8practice.DateApi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2019, 01, 01);
		LocalDate localDate1 = LocalDate.of(2019, 12, 31);
		
		Period period = localDate.until(localDate1);
		System.out.println("Days :"+period.getDays() +"  Months :"+period.getMonths()+"  Years :"+period.getYears());
		
		Period period_1 = Period.ofDays(10);
		System.out.println("Periods of Days :"+period_1.getDays());
		
		Period period_2 = Period.ofYears(10);
		System.out.println("Periods of Year :"+period_2.getYears());
		System.out.println("Periods of Months :" +period_2.toTotalMonths());
		
		Period period_4 = Period.between(localDate, localDate1);
		System.out.println("Days :"+period_4.getDays() +"  Months :"+period_4.getMonths()+"  Years :"+period_4.getYears());
	}

}
