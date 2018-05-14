package com.sda.abstractfactory.Zadanie1;

public class SamsungPC extends AbstractPC {
    public SamsungPC(String computerName, double cpuPower, double gpuPower, boolean isOverclocked) {
        super(computerName, COMPUTER_BRAND.SAMSUNG, cpuPower, gpuPower, isOverclocked);
        System.out.println("Stworzono: " + getComputerName());
    }

    public static AbstractPC createSamsungPc() {
        return new SamsungPC("Samsung Pc", 2.0, 1.0, false);
    }

    public static AbstractPC createSamsungGamingPc() {
        return new SamsungPC("Samsung Gaming Pc", 3.0, 2.0, true);
    }
}
