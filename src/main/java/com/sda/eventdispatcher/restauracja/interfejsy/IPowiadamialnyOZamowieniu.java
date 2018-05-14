package com.sda.eventdispatcher.restauracja.interfejsy;

import java.util.List;

public interface IPowiadamialnyOZamowieniu {
    void zlozylZamowienie(String imie, List<String> zamowienia);
}
