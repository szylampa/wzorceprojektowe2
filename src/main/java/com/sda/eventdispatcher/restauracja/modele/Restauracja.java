package com.sda.eventdispatcher.restauracja.modele;


public class Restauracja {
    public Restauracja() {
        for (int i = 0; i < 5; i++) {
            new Kelner("Marian " + i);
        }
        new Ochroniarz();
        new Kucharz();
    }


}
