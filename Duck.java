package com.bridgelabz.birdsanctuary;

public class Duck extends Bird implements I_Flyable,I_Swimmable {

	String id;
	
	Duck(String id)
	{
		this.id = id;
	}

	
   @Override
	public void fly()
	{
		System.out.println("Duck is flying:");
	}
	
   @Override
	public void eat()
	{
		System.out.println("Duck is eating:");
	}
	
   @Override
	public void swim()
	{
		System.out.println("DUCK is swimming");
	}


   @Override
	public String toString() {
		return "Duck [id=" + id + "]";
	}
	
	
}
