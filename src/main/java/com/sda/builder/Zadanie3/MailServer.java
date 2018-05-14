package com.sda.builder.Zadanie3;

import java.util.ArrayList;
import java.util.List;

public class MailServer {
    List<Client> listaklientow = new ArrayList<>();

    public void connect(Client client) {
        listaklientow.add(client);
    }

    public void disconnect(Client client) {
        listaklientow.remove(client);
    }

    public void sendMessage(Mail m, Client sender) {
        for (Client client : listaklientow) {
            if (client != sender) {
                client.readMail(m);
            }
        }
    }
}
