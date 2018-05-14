package com.sda.observerobservable.SmsStationAsynchronicznie_property;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.util.ArrayList;
import java.util.List;


public class Phone implements ChangeListener<Message> {

    private String phoneNumber;
    private List<String> inbox = new ArrayList<>();

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    @Override
//    public void update(Observable o, Object arg) {
//        if (arg instanceof Message){
//            Message wiadomosc = (Message) arg;
//            if (wiadomosc.getNumer().equals(phoneNumber)){
//                inbox.add(wiadomosc.getTresc());
//                System.out.println("To treść dla mnie " + this);
//            }else {
//                System.out.println("To nie jest wiadomosc dla mnie " + phoneNumber);
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Phone {" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", inbox=" + inbox +
                '}';
    }

    @Override
    public void changed(ObservableValue<? extends Message> observable, Message oldValue, Message wiadomosc) {
        if (wiadomosc.getNumer().equals(phoneNumber)) {
            inbox.add(wiadomosc.getTresc());
            System.out.println("To jest treść dla mnie " + this);
        } else {
            System.out.println("To nie jest treść dla mnie " + phoneNumber);
        }
    }
}
