package com.sda.strategy.Example;

import com.sda.strategy.Example.Strategie.StrategiaWalkiLukiem;
import com.sda.strategy.Example.Strategie.StrategiaWalkiMieczem;

public class Main {
    public static void main(String[] args) {
        Bohater bohater = new Bohater("Marian");
        bohater.setStrategiaWalki(new StrategiaWalkiLukiem());
        bohater.walcz();
    }
}
