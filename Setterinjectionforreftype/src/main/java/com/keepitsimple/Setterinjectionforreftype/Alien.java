package com.keepitsimple.Setterinjectionforreftype;

public class Alien {
	private int age;
	private Laptop lap;
	
	public Alien() {
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Laptop getLap() {
		return lap;
	}
	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	
	public void code() {
		lap.compile();
	}


}
