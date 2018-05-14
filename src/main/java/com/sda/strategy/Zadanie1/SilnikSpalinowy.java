package com.sda.strategy.Zadanie1;

public class SilnikSpalinowy implements INaped{

    @Override
    public int getPoborPraduSilnika() {
        return -20;
    }

    @Override
    public int getPoborPaliwaSilnika() {
        return 5;
    }

    @Override
    public int getMocSilnika() {
        return 100;
    }

}
