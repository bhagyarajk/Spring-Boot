package com.keepitsimple.ConstructorInjection;

public class Alien {
	private int age;
	private Lapatop lap;
	
	
// parameterized constructor to intialize an object during creation
	
	public Alien(int age, Lapatop lap) {
		super();
		this.age = age;
		this.lap = lap;
	}



	public void code() {
		// TODO Auto-generated method stub
		System.out.println("executing the code method from the Alien class ...");
		lap.compile();
		
	}

}
