package com.sda.eventdispatcher.droidan.event.events;

import com.sda.eventdispatcher.droidan.EventDispatcher;
import com.sda.eventdispatcher.droidan.event.listeners.ICallListener;


import java.util.List;

public class CallStartedEvent implements IEvent {
    private int callId;

    public CallStartedEvent(int callId) {
        this.callId = callId;
    }

    @Override
    public void execute() {
        List<ICallListener> powiadamialne = EventDispatcher.getInstance().pobierzObiektyImplementujaceInterfejs(ICallListener.class);
        for (ICallListener powiadamialny : powiadamialne) {
            powiadamialny.callStarted(callId);
        }
    }
}
