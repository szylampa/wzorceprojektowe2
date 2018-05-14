package com.sda.strategy.Zadanie1;

public class SilnikHybrydowy implements INaped {

    @Override
    public int getPoborPraduSilnika() {
        return 5;
    }

    @Override
    public int getPoborPaliwaSilnika() {
        return 2;
    }

    @Override
    public int getMocSilnika() {
        return 80;
    }
}
