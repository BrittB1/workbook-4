package com.pluralsight.dealership;

import java.util.ArrayList;


public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicles> vehicles;


    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicles vehicle) {
        vehicles.add(vehicle);

    }

    public void displayVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
        } else {
            for (Vehicles vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }
}