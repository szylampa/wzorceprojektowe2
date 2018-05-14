package com.sda.strategy.Zadanie0;

public class FormatterInverter implements IFormatterCzcionki {

    public String zamienTekst(String tekstDoZmiany) {

        char[] znaki = tekstDoZmiany.toCharArray();

        for (int i = 0; i < znaki.length; i++) {
            if (Character.isLowerCase(znaki[i])) {
                znaki[i] = Character.toUpperCase(znaki[i]);
            } else if (Character.isUpperCase(znaki[i])) {
                znaki[i] = Character.toLowerCase(znaki[i]);
            }
        }
            return new String(znaki);
    }
}
