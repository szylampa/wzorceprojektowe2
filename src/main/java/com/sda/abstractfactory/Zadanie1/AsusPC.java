package com.sda.abstractfactory.Zadanie1;

public class AsusPC extends AbstractPC {
    protected AsusPC(String computerName, double cpuPower, double gpuPower, boolean isOverclocked) {
        super(computerName, COMPUTER_BRAND.ASUS, cpuPower, gpuPower, isOverclocked);

        System.out.println("Stworzono: " + getComputerName());
    }

    public static AbstractPC createAsusPc() {
        return new AsusPC("Asus Pc", 2.0, 1.0, false);
    }

    public static AbstractPC createAsusGamingPc() {
        return new AsusPC("Asus Gaming Pc", 3.0, 2.0, true);
    }
}
