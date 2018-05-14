package com.sda.proxy.Zadanie1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    private BufferedReader reader;

    public void otworzPlik() {
        try {
            reader = new BufferedReader(new FileReader("plik.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String wczytajLinie() {
        if (reader == null){                             // to oznacza ze plik jeszcze nie jest otwarty
            otworzPlik();
        }
        String linia = null;                             // tworze zmiennna linia
        try {
            linia = reader.readLine();                   //przypisuje zmienna linia
            if (linia == null) {                         //// to znaczy ze doszlismy do konca trzeba przewinac
                przewinPlik();
                linia = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linia;
    }

    private void przewinPlik() {
        //otworzenie pliku czyta go od poczatku
        otworzPlik();
    }

    public void pominLinie(){
        //zignoruje ta linie
        String linia = wczytajLinie();
    }

    public void zamknijPlik(){
        if (reader != null){
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<String> wczytajNLinii(int ileLinii){
        List<String> linie = new ArrayList<>();
        for (int i = 0; i < ileLinii ; i++) {
            linie.add(wczytajLinie());
        }
        return linie;
    }


}
