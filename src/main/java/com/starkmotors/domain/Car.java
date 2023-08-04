package com.starkmotors.domain;

/*
As an admin I should be able to add a car to be sold into the system with following details
    - make
    - model
    - year of manufacturing
    - color
 */

import java.util.UUID;

public class Car implements Entity<Car> {
    private CarId id;
    private String make;
    private String model;
    private Integer yearOfManufacturing;
    private String color;

    public Car(CarId id, String make, String model, Integer yearOfManufacturing, String color) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.yearOfManufacturing = yearOfManufacturing;
        this.color = color;
    }

    public static Car createCar(String make, String model, Integer yearOfManufacturing, String color) {
        return new Car(new CarId(UUID.randomUUID()),
                make,
                model,
                yearOfManufacturing,
                color);
    }

    @Override
    public boolean hasSameIdentityAs(Car that) {
        return this.id.equals(that.id);
    }
}
