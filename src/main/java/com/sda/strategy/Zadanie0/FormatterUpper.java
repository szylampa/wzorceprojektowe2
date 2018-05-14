package com.sda.strategy.Zadanie0;

public class FormatterUpper implements IFormatterCzcionki {
    public String zamienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.toUpperCase();
    }
}
