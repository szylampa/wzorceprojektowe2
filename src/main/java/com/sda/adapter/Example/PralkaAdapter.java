package com.sda.adapter.Example;

public class PralkaAdapter extends Pralka implements ISwitchable {
    @Override
    public void switch_on() {
        super.turn_on();
    }

    @Override
    public void switch_off() {
        super.turn_off();
    }
}
