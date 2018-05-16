package com.sda.adapter.Zadanie1;


import com.sda.adapter.Zadanie1.adapters.CoffeMachineAdapter;
import com.sda.adapter.Zadanie1.adapters.FridgeAdapter;
import com.sda.adapter.Zadanie1.adapters.OvenAdapter;
import com.sda.adapter.Zadanie1.devices.CoffeMachine;
import com.sda.adapter.Zadanie1.devices.Fridge;
import com.sda.adapter.Zadanie1.devices.Oven;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private List<KitchenDevice> deviceList;

    public Kitchen() {
        this.deviceList = new ArrayList<>();
        this.deviceList.add(new CoffeMachineAdapter(new CoffeMachine()));
        this.deviceList.add(new FridgeAdapter(new Fridge()));
        this.deviceList.add(new OvenAdapter(new Oven()));

    }

    public void turnEverythingOn() {
        for (KitchenDevice device : deviceList) {
            device.turnDeviceOn();
        }
    }

}
