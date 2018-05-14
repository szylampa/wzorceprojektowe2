package com.sda.eventdispatcher.droidan.event.listeners;

public interface ICallListener {
    void callStarted(int callId);
    void callEnded(int callId);
}
