package com.sda.observerobservable.SmsStationAsynchronicznie_property;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class SmsStation {

    private ExecutorService pula = Executors.newFixedThreadPool(3);

    private ObjectProperty<Message> lastMessage = new SimpleObjectProperty<>();

    public void addPhone(Phone p) {
        lastMessage.addListener(p);
    }

    public void removePhone(Phone p) {
        lastMessage.removeListener(p);
    }


    public void sendSms(String numerDoKogo, String tresc) {
        Message wiadomosc = new Message(numerDoKogo, tresc);

        lastMessage.setValue(wiadomosc);
    }
}
