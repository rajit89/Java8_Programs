package com.java8practice.optional.customimplementation;

public class Client123 implements Interface1,Interface2,Interface3{
	public void methodA() {
		System.out.println("Interface1 main class   >>>>" +Interface1.class);
	}
	
	public static void main(String[] args) {
		Client123 client123 = new Client123();
		client123.methodA();
		client123.methodB();
	}	
}
