package com.sda.observerobservable.SmsStationAsynchronicznie_oberver;

public class Message implements Runnable {
    private String numer;
    private String tresc;

    public Message(String numer, String tresc) {
        this.numer = numer;
        this.tresc = tresc;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100*tresc.toCharArray().length);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        setChanged();
//        notifyObservers(tresc);
        System.out.println("Wiadomość wysłana");
    }

}
