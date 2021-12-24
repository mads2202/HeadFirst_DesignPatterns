package com.mads2202;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Polo", "grey", 180);
        Car prototype = (Car) car.clone();

        System.out.println(car.equals(prototype));
        System.out.println(car == prototype);
    }
}