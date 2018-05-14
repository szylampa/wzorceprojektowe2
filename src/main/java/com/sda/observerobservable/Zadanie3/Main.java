package com.sda.observerobservable.Zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NewsStation newsStation = new NewsStation();
        newsStation.addObserver(new OgladajacyWiadomosc("Marian", 5));
        newsStation.addObserver(new OgladajacyWiadomosc("Jan", 3));
        newsStation.addObserver(new OgladajacyWiadomosc("Bob", 1));
        newsStation.addObserver(new OgladajacyWiadomosc("Fran", 10));


        boolean praca = true;

        while (praca) {
            String linia = scanner.nextLine().trim().toLowerCase();
            String[] podzielonaLinia = linia.split(" ", 2);

            int waga = Integer.parseInt(podzielonaLinia[0]);
            String tresc = podzielonaLinia[1];
            newsStation.powiadomOWiadomosci(waga, tresc);
        }
    }
}
