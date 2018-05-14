package com.sda.observerobservable.Zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ChatUser implements Observer {
    private int id;
    private String nick;
    private List<String> messages = new ArrayList<>();
    private boolean isAdmin;

    public ChatUser(int id, String nick, boolean isAdmin) {
        this.id = id;
        this.nick = nick;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof ChatMessage) {
            ChatMessage chatMessage = (ChatMessage) arg;
            if (id != chatMessage.getWysylajacy()) {
                messages.add(chatMessage.getTresc());
            }
        }
    }
}
