package com.sda.adapter.Example;

public class CzajnikAdapter implements ISwitchable {
    private Czajnik czajnik;

    public CzajnikAdapter(Czajnik czajnik) {
        this.czajnik = czajnik;
    }

    @Override
    public void switch_on() {
        czajnik.wlacz();
    }

    @Override
    public void switch_off() {
        czajnik.wylacz();
    }
}
