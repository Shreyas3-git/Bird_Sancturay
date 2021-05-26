package com.bridgelabz.birdsanctuary;

public class Application {

	public static void main(String[] args) {
		System.out.println("WELCOME TO BIRD SANCTUARY:");
		
		BirdSanctuaryManager b1  = new BirdSanctuaryManager();
		
		Parrot parrot1 = new Parrot("p1");
		Penguin penguin1 = new Penguin("pn1");
		Duck duck1 = new Duck("dk1");
		
		b1.add(parrot1);
		b1.add(duck1);
		b1.add(penguin1);
		
		b1.print();
		
		b1.printFlyable();
		b1.printEtable();
		b1.printSwimming();
		
	}

}
