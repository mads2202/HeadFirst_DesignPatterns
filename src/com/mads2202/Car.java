package com.mads2202;

import java.util.Objects;

public class Car implements Cloneable {
    private String name;
    private String color;
    private double maxSpeed;

    public Car(String name, String color, double maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected Object clone() {
        return new Car(name, color, maxSpeed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.maxSpeed, maxSpeed) == 0 &&
                name.equals(car.name) &&
                color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, maxSpeed);
    }
}