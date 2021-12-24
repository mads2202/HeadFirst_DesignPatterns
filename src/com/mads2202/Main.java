package com.mads2202;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .addEngine(new Engine())
                .addChassis(new Chassis())
                .addTransmission(new Transmission())
                .addInterior(new Interior())
                .buildCar();
        System.out.println(car.toString());
    }
}