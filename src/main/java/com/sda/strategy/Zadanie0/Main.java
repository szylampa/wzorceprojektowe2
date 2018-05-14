package com.sda.strategy.Zadanie0;

import java.util.Scanner;

/**
 * Stwórz interfejs IFormatterCzcionki, która posiada metodę:
 * <p>
 * - public String zamienTekst(String tekstDoZamiany);
 * <p>
 * Stwórz klasy implementujące podany intefejs:
 * - FormatterUpper - w swojej metodzie zamienTekst podmienia tekst na same wielkie litery
 * - FormatterLower - w swojej metodzie zamienTekst podmienia tekst na same małe litery
 * - FormatterTrim - w swojej metodzie zamienTekst trimuje tekst (metoda trim() na string)
 * - FormatterInverter - zamienia duze litery na małe litery, a małe litery na duże litery
 * - FormatterSplitter - dzieli cały tekst na pojedyncze znaki i zwraca z powrotem ten sam tekst,
 * tylko dopisuje między wszystkimi znakami dodatkowe spacje (czyli zamienia tekst 'to jest tekst' na: 't o   j e s t   t e k s t')
 * <p>
 * <p>
 * Stwórz klasę Drukarka, w klasie stwórz jedno pole i analogicznie do klasy Bohater z przykładu dodaj do niej jedno pole strategii:
 * IFormatterCzcionki formatter = new FormatterUpper();
 * <p>
 * <p>
 * Stwórz obsługę maina, który powinien obsługiwać dwie komendy:
 * - komenda 'zmien' a po niej powinna wystąpić nazwa formattera. np. 'zmien upper', 'zmien inverter',
 * 'zmien splitter'. W zależności od tego którego formattera użyjemy, tak powinna się zmienić referencja w zmiennej formatter (wyżej zadeklarowana).
 * - komenda 'formatuj' po której występuje tekst do sformatowania. np.
 * <p>
 * formatuj to jest tekst
 * <p>
 * powinno wypisać:
 * <p>
 * t o   j e s t   t e k s t
 * jeśli do zmiennej formatter jest przypisany FormatterSplitter.
 */
public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();

        Scanner scanner = new Scanner(System.in);

        boolean isWorking = true;

        while (isWorking) {
            String linia = scanner.nextLine();
            String[] kolumny = linia.split(" ", 2);

            if (kolumny[0].equalsIgnoreCase("zmien")) {
                if (kolumny[1].equalsIgnoreCase("inverter")) {
                    printer.setFormatterCzcionki(new FormatterInverter());
                } else if (kolumny[1].equalsIgnoreCase("splitter")) {
                    printer.setFormatterCzcionki(new FormatterSplitter());
                } else if (kolumny[1].equalsIgnoreCase("lower")) {
                    printer.setFormatterCzcionki(new FormatterLower());
                } else if (kolumny[1].equalsIgnoreCase("upper")) {
                    printer.setFormatterCzcionki(new FormatterUpper());
                } else if (kolumny[1].equalsIgnoreCase("trim")) {
                    printer.setFormatterCzcionki(new FormatterTrim());
                }

            } else if (kolumny[0].equalsIgnoreCase("formatuj")) {
                String wynik = printer.formatuj(kolumny[1]);
                System.out.println(wynik);
            }
        }
    }
}
