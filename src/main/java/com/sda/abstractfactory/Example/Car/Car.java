package com.sda.abstractfactory.Example.Car;

import java.awt.*;

public class Car implements ICar {
    private String brand;
    private String model;
    private double engineCapacity;
    private int horsepower;
    private String licencePlateNumber;
    private Color color;

    public Car(String brand, String model, double engineCapacity, int horsepower, String licencePlateNumber, Color color) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.horsepower = horsepower;
        this.licencePlateNumber = licencePlateNumber;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getLicencePlateNumber() {
        return licencePlateNumber;
    }

    public void setLicencePlateNumber(String licencePlateNumber) {
        this.licencePlateNumber = licencePlateNumber;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
