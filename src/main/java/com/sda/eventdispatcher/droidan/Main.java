package com.sda.eventdispatcher.droidan;

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
                androidSystem.rozpocznijPolaczenia(call_id);
            } else if (command.equalsIgnoreCase("stop")) {
                androidSystem.zakonczPolaczenie(call_id);
            }
        }
    }
}
