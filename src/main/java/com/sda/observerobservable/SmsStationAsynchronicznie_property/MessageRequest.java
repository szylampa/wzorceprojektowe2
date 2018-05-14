package com.sda.observerobservable.SmsStationAsynchronicznie_property;

import javafx.beans.property.ObjectProperty;

public class MessageRequest implements Runnable{
    private Message wiadomosc;
    private SmsStation stacja;

    public MessageRequest(Message wiadomosc, SmsStation stacja) {
        this.wiadomosc = wiadomosc;
        this.stacja = stacja;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(wiadomosc.getTresc().length()*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
