package com.pluralsight.dealership;

import java.util.ArrayList;

public class Dealership {
    private final String name;
    private final String address;
    private final String phone;
    private final ArrayList<Dealership> dealership;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Dealership> getVehicle() {
        return dealership;
    }

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        dealership = new ArrayList<>();
    }

    }
