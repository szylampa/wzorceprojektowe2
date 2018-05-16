package com.sda.adapter.Zadanie1.adapters;

import com.sda.adapter.Zadanie1.KitchenDevice;
import com.sda.adapter.Zadanie1.devices.Fridge;

public class FridgeAdapter implements KitchenDevice {
    private Fridge fridge;

    public FridgeAdapter(Fridge fridge) {
        this.fridge = fridge;
    }

    @Override
    public void turnDeviceOn() {
        fridge.switchOn();
    }

    @Override
    public void turnDeviceOff() {
        fridge.switchOff();
    }
}
