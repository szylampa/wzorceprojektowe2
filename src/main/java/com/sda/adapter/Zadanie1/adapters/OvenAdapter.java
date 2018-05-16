package com.sda.adapter.Zadanie1.adapters;

import com.sda.adapter.Zadanie1.KitchenDevice;
import com.sda.adapter.Zadanie1.devices.Oven;

public class OvenAdapter implements KitchenDevice {
    private Oven oven;

    public OvenAdapter(Oven oven) {
        this.oven = oven;
    }

    @Override
    public void turnDeviceOn() {
        oven.turnOn();
    }

    @Override
    public void turnDeviceOff() {
        oven.turnOff();
    }
}
