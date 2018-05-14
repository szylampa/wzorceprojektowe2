package com.sda.eventdispatcher.restauracja.zdarzenia;

import com.sda.eventdispatcher.restauracja.EventDispatcher;
import com.sda.eventdispatcher.restauracja.interfejsy.IPowiadamialnyOPrzybyciuKlienta;

import java.util.List;

public class KlientPrzyszedl implements IEvent{

    private String imieKlienta;

    public KlientPrzyszedl(String imieKlienta) {
        this.imieKlienta = imieKlienta;
    }

    @Override
    public void execute() {
        List<IPowiadamialnyOPrzybyciuKlienta> powiadamialne = EventDispatcher.getInstance().pobierzObiektyImplementujaceInterfejs(IPowiadamialnyOPrzybyciuKlienta.class);
        for (IPowiadamialnyOPrzybyciuKlienta powiadamialny : powiadamialne) {
            powiadamialny.przybylKlient(imieKlienta);
        }
    }
}
