package com.starkmotors.application;

import com.starkmotors.domain.Customer;
import com.starkmotors.domain.CustomerID;

import java.util.UUID;

public class CarSalesApplication {
    public static void main(String[] args) {
        Customer parikshit = new Customer(new CustomerID(UUID.randomUUID()), "Parikshit", "Navgire", "parikshit@gmail.com");
        //save the customer
    }
}
