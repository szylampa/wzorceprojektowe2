package com.sda.abstractfactory.Zadanie1;

public abstract class AbstractPC {
    protected String computerName;
    protected COMPUTER_BRAND brand;
    protected double cpuPower;
    protected double gpuPower;
    protected boolean isOverclocked;

    public AbstractPC(String computerName, COMPUTER_BRAND brand, double cpuPower, double gpuPower, boolean isOverclocked) {
        this.computerName = computerName;
        this.brand = brand;
        this.cpuPower = cpuPower;
        this.gpuPower = gpuPower;
        this.isOverclocked = isOverclocked;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }
}
