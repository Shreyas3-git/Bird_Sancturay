package com.bridgelabz.birdsanctuary;

public class Parrot extends Bird implements I_Flyable{
	String id ;
	
	public Parrot(String id)
	{
		this.id = id;
	}
	
	@Override
	public void eat() 
	{
		System.out.println("Parrot is eating:");
	}
	
	@Override
	public void fly() 
	{
		System.out.println("Parrot is flying:");
	}
	
	
	

	@Override
	public String toString() {
		return "Parrot [id=" + id + "]";
	}

	
	
}
