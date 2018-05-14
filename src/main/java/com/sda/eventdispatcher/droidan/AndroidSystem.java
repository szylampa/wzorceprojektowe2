package com.sda.eventdispatcher.droidan;

import java.util.List;

public class AndroidSystem  {
    private List<Powiadomienie> listaPowiadomien;

    public AndroidSystem(List<Powiadomienie> listaPowiadomien) {
        this.listaPowiadomien = listaPowiadomien;
        EventDispatcher.getInstance().register(this);


    }
}
