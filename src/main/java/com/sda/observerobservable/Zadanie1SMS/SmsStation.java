package com.sda.observerobservable.Zadanie1SMS;

import java.util.Observable;

public class SmsStation extends Observable {

    public void addPhone(Phone p) {
        addObserver(p);
    }

    public void removePhone(Phone p) {
        deleteObserver(p);
    }

    public void sendSms(String numerDoKogo, String tresc) {
        Message wiadomosc = new Message(numerDoKogo, tresc);

        setChanged();
        notifyObservers(wiadomosc);
    }
}
