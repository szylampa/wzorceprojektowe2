package com.sda.abstractfactory.Example.Main;

import com.sda.abstractfactory.Example.Car.Car;
import com.sda.abstractfactory.Example.Car.CarFactory;
import com.sda.abstractfactory.Example.Car.ICar;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ICar bmw1Car = CarFactory.createBMWe36_1_6();


        Car bmwCar = new Car("BMW", "e36", 1.6, 20, "WEH", Color.BLACK);
    }
}
