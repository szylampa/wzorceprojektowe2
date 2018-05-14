package com.sda.strategy.Zadanie0;

public class FormatterSplitter implements IFormatterCzcionki {
    public String zamienTekst(String tekstDoZmiany) {
        return tekstDoZmiany.replace("", " ").trim();
    }
}
