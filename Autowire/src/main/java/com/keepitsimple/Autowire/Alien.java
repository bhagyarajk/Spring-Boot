package com.keepitsimple.Autowire;

public class Alien {
	private Computer computer;
	
	
	public Alien() {
		// TODO Auto-generated constructor stub
		System.out.println("No argument constructor is called ...this means the object with the default values created");
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		System.out.println("setter is called");
		System.out.println(computer);
		this.computer = computer;
	}
	
	
	public void getNameOfTheComputer() {
		computer.getName();
	}

	

	/* uncomment this for constructor injection autowiring
	 public Alien(Computer computer) {
	super();
	this.computer = computer;
	}
	*/

}
