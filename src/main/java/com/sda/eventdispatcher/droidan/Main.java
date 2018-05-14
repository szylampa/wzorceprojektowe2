package com.sda.eventdispatcher.droidan;

import com.sda.eventdispatcher.droidan.*;
import com.sda.eventdispatcher.droidan.event.events.CallEndedEvent;
import com.sda.eventdispatcher.droidan.event.events.CallStartedEvent;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AndroidSystem androidSystem = new AndroidSystem();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String command = line.split(" ")[0];
            int call_id = Integer.parseInt(line.split(" ")[1]);
            if (command.equalsIgnoreCase("start")) {
                EventDispatcher.getInstance().rozeslij(new CallStartedEvent(call_id));
            } else if (command.equalsIgnoreCase("stop")) {
                EventDispatcher.getInstance().rozeslij(new CallEndedEvent(call_id));
            }
        }
    }

}
