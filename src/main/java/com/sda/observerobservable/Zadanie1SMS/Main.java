package com.sda.observerobservable.Zadanie1SMS;

public class Main {
    public static void main(String[] args) {
        SmsStation smsStation = new SmsStation();
        Phone phone1 = new Phone("666");
        Phone phone2 = new Phone("111");
        Phone phone3 = new Phone("222");

        smsStation.addPhone(phone1);
        smsStation.addPhone(phone2);
        smsStation.addPhone(phone3);

        smsStation.sendSms("222", "Treść");

    }
}
