package com.sda.strategy.Zadanie1;

import java.util.Scanner;

/**
 * Stworzymy aplikację symulującą pracę samochodu, a klasę samochodu zbudujemy wykorzystując wzorzec projektowy Strategy.
 * <p>
 * Treść:
 * Stworzymy klasę Samochód, interfejs INapęd. Stwórz klasę SilnikSpalinowy, który powinien implementować interfejs INapęd. Interfejs powinien mieć metody:
 * - getPoborPraduSilnika(); (zwraca ilość pobieranego prądu przez silnik - silniki spalinowe będą miały wartość ujemną [generują prąd],
 * silniki elektryczne będą miały wartość dodatnią [zżerają prąd])
 * - getPoborPaliwaSilnika(); (zwraca ile paliwa spala silnik na jeden cykl)
 * - getMocSilnika(); (zwraca ilość koni silnika - im więcej koni, tym szybciej samochód przyspiesza)
 * <p>
 * Implementuj te metody (implementuj interfejs) w klasie SilnikSpalinowy. Stwórz drugą klasę SilnikHybrydowy, oraz trzecią SilnikElektryczny -
 * wszystkie mają implementować ten interfejs.
 * <p>
 * Klasa samochód posiada pola:
 * - Nr rejestracyjny samochodu (String)
 * - silnik (obiekt typu INapęd)
 * - prędkość, ilość paliwa, poziom naładowania akumulatorów
 * <p>
 * Samochód posiada metody:
 * - przyspiesz(); - która pobiera odpowiednią ilość prądu, paliwa i zwiększa prędkość samochodu w zależności od mocy silnika
 * - zwolnij(); - która w zależności od typu silnika ładuje akumulatory (hybryda i elektryczny) lub nie (spalinowy)
 * - gettery do wszystkich pól (prędkość, ilość paliwa, poziom naładowania akumulatorów)
 * - metodę toString() - wypisującą stan pojazdu.
 * <p>
 * Spróbuj połączyć ze sobą podane informacje i użyć wzorca Strategy do implementacji tej aplikacji.
 */

public class Main {
    public static void main(String[] args) {

        Samochod samochod = new Samochod("ABC12345");
        samochod.setRodzajNapedu(new SilnikSpalinowy());
        boolean isWorking = true;
        Scanner scanner = new Scanner(System.in);

        while (isWorking) {
            String linia = scanner.nextLine();
            String[] kolumny = linia.split(" ", 2);

            if (kolumny[0].equalsIgnoreCase("zmien")) {
                if (kolumny[1].equalsIgnoreCase("spalinowy")) {
                    samochod.setRodzajNapedu(new SilnikSpalinowy());
                } else if (kolumny[1].equalsIgnoreCase("elektryczny")) {
                    samochod.setRodzajNapedu(new SilnikElektryczny());
                } else if (kolumny[1].equalsIgnoreCase("hybrydowy")) {
                    samochod.setRodzajNapedu(new SilnikHybrydowy());
                }
            } else if (kolumny[0].equalsIgnoreCase("przyspiesz")) {
                samochod.przyspiesz();
                System.out.println(samochod);
            } else if (kolumny[0].equalsIgnoreCase("zwolnij")){
                samochod.zwolnij();
                System.out.println(samochod);
            }
        }

    }
}
