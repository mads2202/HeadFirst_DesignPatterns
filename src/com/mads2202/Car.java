package com.mads2202;

public class Car {
    private Chassis chassis;
    private Transmission transmission;
    private Engine engine;
    private Interior interior;

    public Car(Chassis chassis, Transmission transmission, Engine engine, Interior interior) {
        this.chassis = chassis;
        this.transmission = transmission;
        this.engine = engine;
        this.interior = interior;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public Interior getInterior() {
        return interior;
    }

    @Override
    public String toString() {
        return "Car{" +
                "chassis=" + chassis +
                ", transmission=" + transmission +
                ", engine=" + engine +
                ", interior=" + interior +
                '}';
    }

    public static class CarBuilder {
        private Chassis chassis;
        private Transmission transmission;
        private Engine engine;
        private Interior interior;

        public CarBuilder addEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder addChassis(Chassis chassis) {
            this.chassis = chassis;
            return this;
        }

        public CarBuilder addTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarBuilder addInterior(Interior interior) {
            this.interior = interior;
            return this;
        }

        public Car buildCar() {
            return new Car(chassis, transmission, engine, interior);
        }
    }
}