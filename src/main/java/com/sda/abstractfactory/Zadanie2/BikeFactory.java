package com.sda.abstractfactory.Zadanie2;

public abstract class BikeFactory {
    public static Bike create1seatKross() {
        return new Bike("Kross", 1, 5, BIKE_TYPE.BICYCLE);
    }

    public static Bike create1seatMerida() {
        return new Bike("Merida", 1, 6, BIKE_TYPE.BICYCLE);
    }

    public static Bike create2seatIndiana() {
        return new Bike("Indiana", 2, 3, BIKE_TYPE.TANDEM);
    }

    public static Bike create1seatFelt() {
        return new Bike("Felt", 1, 6, BIKE_TYPE.BICYCLE);
    }

    public static Bike create2seatGoetze() {
        return new Bike("Goetze", 2, 10, BIKE_TYPE.TANDEM);
    }
}
