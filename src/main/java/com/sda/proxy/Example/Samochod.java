package com.sda.proxy.Example;

public class Samochod implements ISamochod {
    public void wlaczSwiatla() {

    }

    public void uruchomSilnik() {
        wlaczSwiatla();
    }

    public void zamknijDrzwi() {
        System.out.println("Dzwi zamkniete");
        uruchomAlarm();
    }

    public void uruchomAlarm() {

    }

    public void wlaczRadio() {

    }
}
