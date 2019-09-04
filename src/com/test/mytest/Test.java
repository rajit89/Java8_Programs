package com.test.mytest;

import java.util.HashMap;

abstract class Bike{
	abstract void run();
	void run_test(){
		System.out.println("in Bike");
	}
	void run_test(int i){
		System.out.println("in Bike ---" + 5);
	}
}
public class Test {

	/*@Override
	void run() {
		System.out.println("in test");
	}
	@Override
	void run_test() {
		System.out.println("in test class");
	}
	@Override
	void run_test(int j) {
		System.out.println("in test class----" + j);
	}
	
	public static void main(String[] args) {
		Bike obj = new Test();
		obj.run();
		obj.run_test();
		obj.run_test(5);
	}*/
	
	public static void main(String[] args) {
	
	HashMap<Integer,String> m = new HashMap<Integer,String>();
	m.put(1,"Rajesh");
	m.put(2,"susil");
	System.out.println(m.put(3,"Rakesh"));
	}
}
