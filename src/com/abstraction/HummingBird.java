package com.abstraction;

public class HummingBird extends Bird {

	public HummingBird(String birdName) {
		super(birdName);
	}

	@Override
	public void birdFly() {
		System.out.println("catching small ﬂying insects");
	}

	@Override
	public void animalEat() {
		System.out.println(getAnimalName()+" is pecking");
	}

	@Override
	protected void animalBreathe() {
		System.out.println("Breathe in, Breathe out, Repeat");
	}

	@Override
	public void animalSound() {
		System.out.println("sound "+ getAnimalName() +" make squeaks");

	}

}
