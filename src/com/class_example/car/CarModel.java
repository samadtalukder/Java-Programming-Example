package com.class_example.car;

public class CarModel {
    // default variables
    int engineCC;
    // protected variables
    protected int manufactureYear;
    // public variables
    public String manufactureName;
    // private variable
    private String modelName;
    private String carKey;
    private float fuelAmount;
    private final float amountOfFuelConsumedPerSecond = 0.02f;

    public CarModel() {
        manufactureName = new String();
        modelName = new String();
        engineCC = 1000;
        fuelAmount = 0;
        manufactureYear = 0;
    }

    public CarModel(String carName) {
        this.manufactureName = carName;
        modelName = new String();
        engineCC = 0;
        fuelAmount = 0;
        manufactureYear = 0;
    }

    public CarModel(String manufactureName, String modelName,int engineCC, float fuelAmount) {
        this.manufactureName = manufactureName;
        this.modelName = modelName;
        this.fuelAmount = fuelAmount;
        this.engineCC = engineCC;
        this.manufactureYear = 0;
    }

    public CarModel(String manufactureName, String modelName, String carKey, int engineCC, float fuelAmount) {
        this.manufactureName = manufactureName;
        this.modelName = modelName;
        this.carKey = carKey;
        this.engineCC = engineCC;
        this.fuelAmount = fuelAmount;
        this.manufactureYear = 0;
    }

    public float presentAmountOfFuel() {
        return fuelAmount;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public String getModelName() {
        return modelName;
    }

    public void addFuel(float fuelAmount) {
        this.fuelAmount += fuelAmount;
    }

    public void runForSeconds(int timeInSeconds) {
        float usedFuel = timeInSeconds * amountOfFuelConsumedPerSecond;
        fuelAmount -= usedFuel;
    }

    public boolean matchPassword(String userInput) {
        return userInput.equals(carKey);
    }

    public void printCarInfo() {
        System.out.println("\n");
        System.out.println("Manufacturer : " + manufactureName);
        System.out.println("Model Name : " + getModelName());
        System.out.println("Password Match: " + matchPassword("st#06"));
        System.out.println("2nd car CC :" + engineCC);
        System.out.println("Amount of Fuel : " + presentAmountOfFuel() + "L");
        addFuel(2);
        System.out.println("Amount of Fuel after adding 2L : " + presentAmountOfFuel() + "L");
    }
}
