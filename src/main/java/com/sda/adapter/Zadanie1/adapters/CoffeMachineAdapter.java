package com.sda.adapter.Zadanie1.adapters;

import com.sda.adapter.Zadanie1.KitchenDevice;
import com.sda.adapter.Zadanie1.devices.CoffeMachine;

public class CoffeMachineAdapter implements KitchenDevice {
    private CoffeMachine coffeMachine;

    public CoffeMachineAdapter(CoffeMachine coffeMachine) {
        this.coffeMachine = coffeMachine;
    }

    public void turnDeviceOn() {
        coffeMachine.on();
    }

    @Override
    public void turnDeviceOff() {
        coffeMachine.off();
    }
}
