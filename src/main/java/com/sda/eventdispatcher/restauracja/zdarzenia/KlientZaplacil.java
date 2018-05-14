package com.sda.eventdispatcher.restauracja.zdarzenia;

import com.sda.eventdispatcher.restauracja.EventDispatcher;
import com.sda.eventdispatcher.restauracja.interfejsy.IPowiadamialnyOZaplacieZaPosilek;

import java.util.List;

public class KlientZaplacil implements IEvent {
    private String imieKlienta;

    public KlientZaplacil(String imieKlienta) {
        this.imieKlienta = imieKlienta;
    }

    @Override
    public void execute() {
        List<IPowiadamialnyOZaplacieZaPosilek> powiadamialne = EventDispatcher.getInstance().pobierzObiektyImplementujaceInterfejs(IPowiadamialnyOZaplacieZaPosilek.class);
        for (IPowiadamialnyOZaplacieZaPosilek powiadamialny : powiadamialne) {
            powiadamialny.klientZaplacil(imieKlienta);
        }
    }
}
