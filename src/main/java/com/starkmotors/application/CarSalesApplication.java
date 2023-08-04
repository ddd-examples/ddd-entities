package com.starkmotors.application;

import com.starkmotors.domain.Car;
import com.starkmotors.domain.Customer;
import com.starkmotors.domain.CustomerID;

import java.util.UUID;

public class CarSalesApplication {
    public static void main(String[] args) {
        //get the car details from a request
        Car marutiSwift = Car.createCar("Maruti", "Swift", 2015, "Red");
        //persist the car
    }
}
