package com.sda.builder.Zadanie3;

import java.time.LocalDate;

public class Mail {
    private String tresc, nadawca, nazwaSerwera, nazwaSkrzynki;
    private boolean czySzyfr, isSpam;
    private Type type;
    private LocalDate dataNadania, dataOdbioru;

    public Mail(String tresc, String nadawca, String nazwaSerwera, String nazwaSkrzynki,
                boolean czySzyfr, boolean isSpam, Type type, LocalDate dataNadania, LocalDate dataOdbioru) {
        this.tresc = tresc;
        this.nadawca = nadawca;
        this.nazwaSerwera = nazwaSerwera;
        this.nazwaSkrzynki = nazwaSkrzynki;
        this.czySzyfr = czySzyfr;
        this.isSpam = isSpam;
        this.type = type;
        this.dataNadania = dataNadania;
        this.dataOdbioru = dataOdbioru;
    }

    public static class Builder {

        private String tresc;
        private String nadawca;
        private String nazwaSerwera;
        private String nazwaSkrzynki;
        private boolean czySzyfr;
        private boolean isSpam;
        private Type type;
        private LocalDate dataNadania;
        private LocalDate dataOdbioru;

        public Builder setTresc(String tresc) {
            this.tresc = tresc;
            return this;
        }

        public Builder setNadawca(String nadawca) {
            this.nadawca = nadawca;
            return this;
        }

        public Builder setNazwaSerwera(String nazwaSerwera) {
            this.nazwaSerwera = nazwaSerwera;
            return this;
        }

        public Builder setNazwaSkrzynki(String nazwaSkrzynki) {
            this.nazwaSkrzynki = nazwaSkrzynki;
            return this;
        }

        public Builder setCzySzyfr(boolean czySzyfr) {
            this.czySzyfr = czySzyfr;
            return this;
        }

        public Builder setIsSpam(boolean isSpam) {
            this.isSpam = isSpam;
            return this;
        }

        public Builder setType(Type type) {
            this.type = type;
            return this;
        }

        public Builder setDataNadania(LocalDate dataNadania) {
            this.dataNadania = dataNadania;
            return this;
        }

        public Builder setDataOdbioru(LocalDate dataOdbioru) {
            this.dataOdbioru = dataOdbioru;
            return this;
        }

        public Mail createMail() {
            return new Mail(tresc, nadawca, nazwaSerwera, nazwaSkrzynki, czySzyfr, isSpam, type, dataNadania, dataOdbioru);
        }
    }
}
