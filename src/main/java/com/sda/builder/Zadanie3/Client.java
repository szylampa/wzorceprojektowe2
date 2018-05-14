package com.sda.builder.Zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<Mail> lista = new ArrayList<Mail>();

    public Client(String name) {
        this.name = name;
    }

    public void readMail(Mail m) {
        lista.add(m);
        System.out.println("Klient " + name + " otrzymal maila od: ");
    }
}
