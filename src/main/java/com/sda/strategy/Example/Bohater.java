package com.sda.strategy.Example;

public class Bohater {
    private String name;
    private IStrategia strategiaWalki;

    public Bohater(String name) {
        this.name = name;
    }

    public void setStrategiaWalki(IStrategia strategiaWalki) {
        this.strategiaWalki = strategiaWalki;
    }

    public void walcz(){
        strategiaWalki.walcz();
    }
}
