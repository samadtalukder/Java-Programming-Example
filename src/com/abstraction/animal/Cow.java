package com.abstraction.animal;

public class Cow extends Animal {

	public Cow(String animalName) {
		super(animalName);

	}

	@Override
	public void animalEat() {
		System.out.println(getAnimalName() + " is eating");
	}

	@Override
	protected void animalBreathe() {
		System.out.println("Breathe in, Breathe out, Repeat");
	}
	@Override
	public void animalSound() {
		System.out.println("Hamba Hamba");
		
	}

}
