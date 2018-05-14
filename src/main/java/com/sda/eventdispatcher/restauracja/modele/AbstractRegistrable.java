package com.sda.eventdispatcher.restauracja.modele;


import com.sda.eventdispatcher.restauracja.EventDispatcher;

public abstract class AbstractRegistrable {
    public AbstractRegistrable() {
        EventDispatcher.getInstance().register(this);
    }
}
