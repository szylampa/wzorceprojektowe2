package com.sda.observerobservable.SmsStationAsynchronicznie_oberver;

import java.util.Observable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SmsStation extends Observable {

    private ExecutorService pulawatkow = Executors.newCachedThreadPool();

    public void addPhone(Phone p) {
        addObserver(p);
    }

    public void removePhone(Phone p) {
        deleteObserver(p);
    }

    public void sendSms(String numerDoKogo, String tresc) {
        Message wiadomosc = new Message(numerDoKogo, tresc);
        pulawatkow.submit(wiadomosc);
    }
}
