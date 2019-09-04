package com.java8practice;

public class LegacyVsjava8Runnable {
	
	public static void main(String[] args) {
		Runnable runn = new Runnable() {
			@Override
			public void run() {
				System.out.println("Legacy runnable method...1");
			}
		};
		new Thread(runn).start();
		
		Runnable newRunnable = () -> System.out.println("Java 8 runnable method...2");
		
		new Thread(newRunnable).start();
		
		new Thread(() -> System.out.println("Java 8 runnable method...3")).start();
	}

}
