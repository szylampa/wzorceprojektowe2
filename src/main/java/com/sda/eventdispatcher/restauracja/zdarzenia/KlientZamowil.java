package com.sda.eventdispatcher.restauracja.zdarzenia;

import com.sda.eventdispatcher.restauracja.EventDispatcher;
import com.sda.eventdispatcher.restauracja.interfejsy.IPowiadamialnyOZamowieniu;

import java.util.ArrayList;
import java.util.List;

public class KlientZamowil implements IEvent{
    private String imie;

    public KlientZamowil(String imie) {
        this.imie = imie;
    }

    @Override
    public void execute() {
        List<IPowiadamialnyOZamowieniu> powiadamialne = EventDispatcher.getInstance().pobierzObiektyImplementujaceInterfejs(IPowiadamialnyOZamowieniu.class);
        for (IPowiadamialnyOZamowieniu powiadamialny : powiadamialne) {
            powiadamialny.zlozylZamowienie(imie, new ArrayList<String>());
        }
    }
}
