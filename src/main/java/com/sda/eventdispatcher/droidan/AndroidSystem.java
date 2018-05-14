package com.sda.eventdispatcher.droidan;

import com.sda.eventdispatcher.droidan.event.aplikacje.CallRecorderApplication;
import com.sda.eventdispatcher.droidan.event.aplikacje.PhoneApplication;
import com.sda.eventdispatcher.droidan.event.listeners.ICallListener;

import java.util.ArrayList;
import java.util.List;

public class AndroidSystem implements ICallListener {

    private List<Powiadomienie> listaPowiadomien;
    private List<Integer> listaPolaczen;

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
    }

    @Override
    public void callEnded(int callId) {
        listaPolaczen.remove((Integer) callId);
        System.out.println("System powiadomiony o zakonczeniu polaczenia: " + callId);
    }
}
