package com.class_example.car;

public class SubCarModel extends CarModel {
    private float chargeInBattery;
    private String colorString;

    public SubCarModel() {
        super();
    }

    public SubCarModel(String manufactureName, String modelName, int engineCC, float fuelAmount) {
        super(manufactureName, modelName, engineCC, fuelAmount);
    }

    public SubCarModel(String manufactureName, String modelName, String carKey, int engineCC, float fuelAmount, float chargeInBattery, String colorString) {
        super(manufactureName, modelName, carKey, engineCC, fuelAmount);
        this.chargeInBattery = chargeInBattery;
        this.colorString = colorString;
    }

    public float getChargeInBattery() {
        return chargeInBattery;
    }

    public void setChargeInBattery(float chargeInBattery) {
        this.chargeInBattery = chargeInBattery;
    }

    public String getColorString() {
        return colorString;
    }

    public void setColorString(String colorString) {
        this.colorString = colorString;
    }

    @Override
    public void printCarInfo() {
        super.printCarInfo();
        runForSeconds(60);
        System.out.println("Password Match : " + matchPassword("fe$21"));
        System.out.println("Amount of Fuel after driving for 60s : " + presentAmountOfFuel() + "L");
        System.out.println("Charge in Battery :" + getChargeInBattery());
        System.out.println("Color of car :" + getColorString());
    }
}
