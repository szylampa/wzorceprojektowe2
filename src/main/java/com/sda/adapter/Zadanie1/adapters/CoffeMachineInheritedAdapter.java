package com.sda.adapter.Zadanie1.adapters;

import com.sda.adapter.Zadanie1.KitchenDevice;
import com.sda.adapter.Zadanie1.devices.CoffeMachine;

public class CoffeMachineInheritedAdapter extends CoffeMachine implements KitchenDevice {

    public void turnDeviceOn() {
        super.on();
    }

    @Override
    public void turnDeviceOff() {

    }
}
