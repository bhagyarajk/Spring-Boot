package com.keepitsimple.AutowirebyName;

public class Alien {
	private Laptop lap;

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

	public void code() {
		// TODO Auto-generated method stub
		System.out.println("inside code method inside of Alien class");
		lap.tellName();
		
	}


	
	

}
