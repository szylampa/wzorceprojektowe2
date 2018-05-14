package com.sda.eventdispatcher.droidan.event.aplikacje;

import com.sda.eventdispatcher.droidan.EventDispatcher;

public abstract class AbstractRegistrableAplication {
    public AbstractRegistrableAplication() {
        EventDispatcher.getInstance().register(this);
    }
}