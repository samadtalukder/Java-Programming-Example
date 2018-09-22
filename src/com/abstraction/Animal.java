package com.abstraction;

public abstract class Animal {
	private String animalName;

	public Animal(String animalName) {
		this.animalName = animalName;
	}
	public String getAnimalName() {
		return animalName;
	}
	public abstract void animalEat();
	protected abstract void animalBreathe();
	public abstract void animalSound();
}
