package com.sda.eventdispatcher.droidan;

import com.sda.eventdispatcher.droidan.event.aplikacje.CallRecorderApplication;
import com.sda.eventdispatcher.droidan.event.aplikacje.PhoneApplication;
import com.sda.eventdispatcher.droidan.event.events.CallEndedEvent;
import com.sda.eventdispatcher.droidan.event.events.CallStartedEvent;
import com.sda.eventdispatcher.droidan.event.listeners.ICallListener;

import java.util.ArrayList;
import java.util.List;

public class AndroidSystem implements ICallListener {

    private List<Powiadomienie> listaPowiadomien;
    private List<Integer> listaPolaczen;
    private Integer trwajacePolaczenie = null;

    public AndroidSystem() {
        EventDispatcher.getInstance().register(this);
        this.listaPowiadomien = new ArrayList<>();
        this.listaPolaczen = new ArrayList<>();
        new CallRecorderApplication();
        new PhoneApplication();
    }

    @Override
    public void callStarted(int callId) {
        listaPolaczen.add(callId);
        System.out.println("System powiadomiony o rozpoczeciu polaczenia: " + callId);
        trwajacePolaczenie = callId;
    }

    @Override
    public void callEnded(int callId) {
        listaPolaczen.remove((Integer) callId);
        System.out.println("System powiadomiony o zakonczeniu polaczenia: " + callId);
        trwajacePolaczenie = null;
    }

    public void rozpocznijPolaczenia(int call_ID) {
        if (trwajacePolaczenie == null) {
            EventDispatcher.getInstance().rozeslij(new CallStartedEvent(call_ID));
        }else{
            System.out.println("Nie moge rozpoczac polaczenie, trwa polaczenie: " + trwajacePolaczenie);
        }
    }

    public void zakonczPolaczenie(int call_ID) {
        if (trwajacePolaczenie!= null && trwajacePolaczenie == call_ID){
        EventDispatcher.getInstance().rozeslij(new CallEndedEvent(call_ID));
        }else {
            System.out.println("Nie moge zakonczyc polaczenie: " + null);
        }
    }
}
