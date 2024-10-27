package com.pluralsight.dealership;

public class Vehicles {

    private String makeModel;
    private int year;
    private int price;
    private String color;
    private int mileage;
    private String type;

    public Vehicles(String makeModel, int year, int price, String color, int mileage, String type) {
        this.makeModel = makeModel;
        this.year = year;
        this.price = price;
        this.color = color;
        this.mileage = mileage;
        this.type = type;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }

    public String getType() {
        return type;
    }
}

