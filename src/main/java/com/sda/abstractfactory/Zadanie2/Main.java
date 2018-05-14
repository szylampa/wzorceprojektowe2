package com.sda.abstractfactory.Zadanie2;

/*
Należy stworzyć aplikację symulującą fabrykę rowerów. Klasa Bike: ma markę, ilość miejsc, ilość przerzutek, oraz typ roweru (bicycle, tandem).

BIKE_TYPE: BICYCLE, TANDEM

Stwórz i przetestuj fabrykę abstrakcyjną (BikeFactory) która pozwala na tworzenie:

Rowerów jednoosbowych, marki KROSS, które mają 5 przerzutek
Rowerów jednoosbowych, marki MERIDA, które mają 6 przerzutek
Tandemów, marki INIANA, które mają 3 przerzutki
Rowerów jednoosbowych, marki FELT, które mają 6 przerzutek
Tandemów, marki GOETZE, które mają jedną przerzutkę

 */
public class Main {
    public static void main(String[] args) {
        Bike bike1 = BikeFactory.create1seatFelt();
        Bike bike2 = BikeFactory.create2seatGoetze();
    }
}
