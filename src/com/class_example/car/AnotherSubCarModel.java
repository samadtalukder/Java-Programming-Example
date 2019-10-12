package com.class_example.car;

public class AnotherSubCarModel extends CarModel implements CarInterface {

    public AnotherSubCarModel(String manufactureName, String modelName, int engineCC, float fuelAmount) {
        super(manufactureName, modelName, engineCC, fuelAmount);
    }

    @Override
    public void driveCar(int drivingTimeInSeconds) {
        runForSeconds(drivingTimeInSeconds);
    }

    @Override
    public void addAmountOfFuel(int amount) {
        addAmountOfFuel(amount);
    }


    @Override
    public int getManufactureYear() {
        return manufactureYear;
    }

    @Override
    public String getCarModelName() {
        return getModelName();
    }
}
