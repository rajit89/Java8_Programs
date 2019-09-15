package com.java8practice.optional.customimplementation;

public class Client14 implements Interface1,Interface4{
	
	@Override
	public void methodA() {
		System.out.println("Need to give the implementation to resolve the issue...."+Client14.class );
	}
	
	public static void main(String[] args) {
		Client14 client14 = new Client14();
		client14.methodA();
	}
}
