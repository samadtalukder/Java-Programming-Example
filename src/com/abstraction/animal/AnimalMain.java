package com.abstraction.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Cow cow = new Cow("Cow");
			cow.animalEat();
			cow.animalBreathe();
			cow.animalSound();
		HummingBird hummingBird = new HummingBird("Humming Bird");
			hummingBird.animalEat();
			hummingBird.birdFly();
			hummingBird.animalBreathe();
			hummingBird.animalSound();
	}

}
