package com.bridgelabz.birdsanctuary;

import java.util.ArrayList;
import java.util.List;

public class BirdSanctuaryManager implements I_Flyable,I_Swimmable
{

	List<Bird> birdList = new ArrayList<Bird>();
	
	public void add(Bird bird)
	{
		birdList.add(bird);
	}
	
	public void print()
	{
		for( Bird bird : birdList )
		{
			System.out.println(bird);
		}
	}
	
	public void printFlyable()
	{
		for( Bird bird : birdList )
		{
			if(bird instanceof I_Flyable)
			{
				((I_Flyable)bird).fly();
			}
		}
	}
	
	public void printEtable()
	{
		for( Bird bird : birdList )
		{
			bird.eat();
		}
	}
	
	public void printSwimming()
	{
		
		for( Bird bird : birdList )
		{
			if(bird instanceof I_Swimmable)
			{
				((I_Swimmable)bird).swim();
			}
			
		}
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}


