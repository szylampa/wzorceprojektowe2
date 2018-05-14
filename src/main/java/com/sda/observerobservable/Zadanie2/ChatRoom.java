package com.sda.observerobservable.Zadanie2;


import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class ChatRoom extends Observable {
    private String roomName;
    private Map<Integer, ChatUser> users = new HashMap<>();
    private int userCounter = 0;

    public void userLogin(String nick) {
        ChatUser user = new ChatUser(userCounter++, nick, false);
        if (nick.equalsIgnoreCase("admin") || nick.startsWith("admin")) {
            user.setAdmin(true);
        }
        addObserver(user);   // podpięcie mechanizmu observer observable
        users.put(user.getId(), user);
    }

    public void sendMessage(int wysylajacy, String trescWiadomosci) {
        ChatMessage wiadomosc = new ChatMessage(wysylajacy, trescWiadomosci);
        setChanged();
        notifyObservers(wiadomosc);

    }

    public void kickUser(int wyrzucajacy, int wyrzucany) {

    }
}
