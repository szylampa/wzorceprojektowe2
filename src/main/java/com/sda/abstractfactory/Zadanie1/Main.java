package com.sda.abstractfactory.Zadanie1;

/*
Stwórz klasę abstrakcyjną AbstractPC która posiada:
pole tekst - nazwę komputera
pole COMPUTER_BRAND - markę komputera
pole cpu_power - moc komputera (int 0-100)
pole gpu_power - moc grafiki komputera (double 0.00 - 1.00)
pole isOverclocked - flaga definiująca czy komputer był "podrasowany"


COMPUTER_BRAND: ASUS, HP, SAMSUNG, APPLE
Stwórz klasy dziedziczące:
AsusPC, HpPC, SamsungPC, AppleMac które dziedziczą po komputerze.
W każdej klasie stwórz metody factory. Dla każdej marki wymyśl dwa komputery.
 */

public class Main {
    public static void main(String[] args) {
        AbstractPC pc = AsusPC.createAsusGamingPc();
        SamsungPC.createSamsungGamingPc();

    }
}
