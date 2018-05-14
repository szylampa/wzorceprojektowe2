package com.sda.abstractfactory.Example.Car;


import java.awt.*;

public class CarFactory {
    public static Car createBMWe36_1_6() {
        return new Car("BMW", "e36", 1.6, 20, "WEH", Color.BLACK);
    }

    public static Car createBMWe46_1_8() {
        return new Car("BMW", "e46", 1.8, 20, "WEH", Color.BLACK);
    }
}
