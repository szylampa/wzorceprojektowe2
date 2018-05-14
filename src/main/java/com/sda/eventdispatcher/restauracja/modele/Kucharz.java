package com.sda.eventdispatcher.restauracja.modele;

import com.sda.eventdispatcher.restauracja.interfejsy.IPowiadamialnyOZamowieniu;

import java.util.List;

public class Kucharz extends AbstractRegistrable implements IPowiadamialnyOZamowieniu {
    @Override
    public void zlozylZamowienie(String imie, List<String> zamowienia) {
        System.out.println("Już robię zamówienie klienta: " + imie + " jest to : " + zamowienia);
    }
}
