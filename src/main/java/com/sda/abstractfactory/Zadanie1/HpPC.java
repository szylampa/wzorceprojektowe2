package com.sda.abstractfactory.Zadanie1;

public class HpPC extends AbstractPC {
    private HpPC(String computerName, double cpuPower, double gpuPower, boolean isOverclocked) {
        super(computerName, COMPUTER_BRAND.HP, cpuPower, gpuPower, isOverclocked);

        System.out.println("Utworzono: " + getComputerName());

    }

    public static AbstractPC createHpPc() {
        return new HpPC("Hp Pc", 2.0, 1.0, false);
    }

    public static AbstractPC createHpGamingPc() {
        return new HpPC("Hp Gaming Pc", 3.0, 2.0, true);
    }
}
