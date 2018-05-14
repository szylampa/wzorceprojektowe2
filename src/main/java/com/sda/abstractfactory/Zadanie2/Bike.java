package com.sda.abstractfactory.Zadanie2;

public class Bike {
    private String brand;
    private int seats;
    private int gears;
    private BIKE_TYPE type;

    public Bike(String brand, int seats, int gears, BIKE_TYPE type) {
        this.brand = brand;
        this.seats = seats;
        this.gears = gears;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public BIKE_TYPE getType() {
        return type;
    }

    public void setType(BIKE_TYPE type) {
        this.type = type;
    }
}
