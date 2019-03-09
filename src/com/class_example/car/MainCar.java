package com.class_example.car;

public class MainCar {
    private static CarModel carModel = new CarModel();
    private static CarModel anotherCarModel;

    public static void main(String[] args) {
        anotherCarModel = new CarModel("Toyota");
        System.out.println("Manufacture: " + anotherCarModel.manufactureName);
        anotherCarModel = new CarModel("BMW", "BMW-2019", "st#06",9000, 180);
        System.out.println("Manufacture: "+anotherCarModel.manufactureName);
        System.out.println("Model Name: "+anotherCarModel.getModelName());
        System.out.println("Match Password: "+anotherCarModel.matchPassword("st#06"));
        System.out.println("EngineCC: "+anotherCarModel.engineCC);
        System.out.println("Amount of Fuel: "+anotherCarModel.presentAmountOfFuel()+"L");
        anotherCarModel.addFuel(20);
        System.out.println("Amount of Fuel After Adding : "+anotherCarModel.presentAmountOfFuel()+"L");
        anotherCarModel.runForSeconds(60);
        System.out.println("Amount of Fuel After Driving 60s : "+anotherCarModel.presentAmountOfFuel()+"L");

        System.out.println("----------");

        CarModel secondCar = new CarModel("Hyundai", "Hyundai-H-2019", "hon#09",5000, 80);
        System.out.println("Manufacture: "+secondCar.manufactureName);
        System.out.println("Model Name: "+secondCar.getModelName());
        System.out.println("Match Password: "+secondCar.matchPassword("st#06"));
        System.out.println("EngineCC: "+secondCar.engineCC);
        System.out.println("Amount of Fuel: "+secondCar.presentAmountOfFuel()+"L");
        secondCar.addFuel(30);
        System.out.println("Amount of Fuel After Adding : "+secondCar.presentAmountOfFuel()+"L");
        secondCar.runForSeconds(80);
        System.out.println("Amount of Fuel After Driving 80s : "+secondCar.presentAmountOfFuel()+"L");

        CarModel thirdCar = new CarModel("Audi", "Audi-A3-2019", "aud@2",7500, 150);
        thirdCar.printCarInfo();
        // SubCarModel Class Object
        SubCarModel subCarModel = new SubCarModel("Ferrari S.p.A","Ferrari S6 2019","fe$21",18000,1000,85,"BLack");
        subCarModel.printCarInfo();
    }
}
