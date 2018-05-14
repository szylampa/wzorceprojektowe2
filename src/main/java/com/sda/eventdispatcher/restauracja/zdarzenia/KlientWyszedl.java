package com.sda.eventdispatcher.restauracja.zdarzenia;

import com.sda.eventdispatcher.restauracja.EventDispatcher;
import com.sda.eventdispatcher.restauracja.interfejsy.IPowiadamialnyOWyjsciuKlienta;

import java.util.List;

public class KlientWyszedl implements IEvent {
    private String imie;

    public KlientWyszedl(String imie) {
        this.imie = imie;
    }

    @Override
    public void execute() {
        List<IPowiadamialnyOWyjsciuKlienta> powiadamialne = EventDispatcher.getInstance().pobierzObiektyImplementujaceInterfejs(IPowiadamialnyOWyjsciuKlienta.class);
        for (IPowiadamialnyOWyjsciuKlienta powiadamialny : powiadamialne) {
            powiadamialny.klientOpuscilLokal(imie);
        }
    }
}
