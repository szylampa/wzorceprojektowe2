package com.sda.proxy.Zadanie1;

import java.io.File;

/**
 * Stwórz aplikację, która służy do obsługi plików. Zastosuj wzorzec proxy aby ukryć metody, których użytkownik nie powinien widzieć.
 * Podstawowa klasa (implementacja) powinna zawierać metody:
 * konstruktor
 * otwórz plik
 * wczytaj linię - ma zwrócić tą linię
 * przewiń plik - zamyka plik i otwiera go ponownie
 * zamknij plik
 * pomiń linię - wczytuje linie i ją ignoruje
 * pomiń n linii - ma pominąć n linii
 * wczytaj n linii - ma zwrócić listę n linii
 *
 * Interfejs proxy powinien posiadać metody:
 * wczytaj n linii - ma zwrócić listę n linii
 * pomiń n linii - wykonuje wczytanie n-linii, ale nie zwraca tych linii (w przeciwieństwie do ‘wczytaj n linii)
 *
 * Stwórz maina, a w nim implementację, która czyta plik używając proxy (zamiast klasy końcowej). Przetestuj wczytywanie linii.
 * UWAGA! Jeśli plik zostanie przeczytany do końca zastosuj przewinięcie pliku od zera (czytaj go odnowa).
 */
public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        System.out.println(fileService.wczytajLinie());
    }
}
