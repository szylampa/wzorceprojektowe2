package com.sda.observerobservable.Zadanie1SMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Phone implements Observer {

    private String phoneNumber;
    private List<String> inbox = new ArrayList<>();

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Message) {
            Message wiadomosc = (Message) arg;
            if (wiadomosc.getNumer().equals(phoneNumber)) {
                inbox.add(wiadomosc.getTresc());
                System.out.println("To treść dla mnie " + this);
            } else {
                System.out.println("To nie jest wiadomosc dla mnie " + phoneNumber);
            }
        }
    }

    @Override
    public String toString() {
        return "Phone {" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", inbox=" + inbox +
                '}';
    }
}
