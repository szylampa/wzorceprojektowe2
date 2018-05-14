package com.sda.eventdispatcher.droidan.event.aplikacje;

import com.sda.eventdispatcher.droidan.event.listeners.ICallListener;

public class CallRecorderApplication extends AbstractRegistrableAplication implements ICallListener {

    @Override
    public void callStarted(int callId) {
        System.out.println("Call recoreder powiadomiony o rozpoczeciu: " + callId);
    }

    @Override
    public void callEnded(int callId) {
        System.out.println("Call recoreder powiadomiony o zakonczeniu: " + callId);

    }
}
