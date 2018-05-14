package com.sda.strategy.Zadanie1;

public class SilnikElektryczny implements INaped {

    @Override
    public int getPoborPraduSilnika() {
        return 10;
    }

    @Override
    public int getPoborPaliwaSilnika() {
        return 0;
    }

    @Override
    public int getMocSilnika() {
        return 90;
    }
}
