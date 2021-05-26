package com.bridgelabz.birdsanctuary;

public class Penguin extends Bird implements I_Flyable,I_Swimmable{

	String id;
	
	Penguin(String id)
	{
		this.id = id;
		
	}

	@Override
	public void fly()
	{
		System.out.println("Penguin is flying:");
	}
	
	@Override
	
	public void eat()
	{
		System.out.println("Penguin is eating:");
	}
	
	@Override
	public void swim()
	{
		System.out.println("Penguin is swimming:");
	}

	@Override
	public String toString() {
		return "Penguin [id=" + id + "]";
	}
	
	
}
