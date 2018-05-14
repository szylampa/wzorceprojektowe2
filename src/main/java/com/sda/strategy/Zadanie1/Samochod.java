package com.sda.strategy.Zadanie1;

public class Samochod {
    private String numerRejestracyjny;
    private INaped rodzajNapedu;
    private int predkosc = 0;
    private int iloscPaliwa = 20;
    private int poziomNaladowaniaAkumulatorow = 50;

    public Samochod(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public void setNumerRejestracyjny(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public INaped getRodzajNapedu() {
        return rodzajNapedu;
    }

    public void setRodzajNapedu(INaped rodzajNapedu) {
        this.rodzajNapedu = rodzajNapedu;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public int getIloscPaliwa() {
        return iloscPaliwa;
    }

    public void setIloscPaliwa(int iloscPaliwa) {
        this.iloscPaliwa = iloscPaliwa;
    }

    public int getPoziomNaladowaniaAkumulatorow() {
        return poziomNaladowaniaAkumulatorow;
    }

    public void setPoziomNaladowaniaAkumulatorow(int poziomNaladowaniaAkumulatorow) {
        this.poziomNaladowaniaAkumulatorow = poziomNaladowaniaAkumulatorow;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "numerRejestracyjny='" + numerRejestracyjny + '\'' +
                ", rodzajNapedu=" + rodzajNapedu +
                ", predkosc=" + predkosc +
                ", iloscPaliwa=" + iloscPaliwa +
                ", poziomNaladowaniaAkumulatorow=" + poziomNaladowaniaAkumulatorow +
                '}';
    }

    public void przyspiesz() {
        predkosc = (int) (predkosc - rodzajNapedu.getMocSilnika() * 0.3);
        iloscPaliwa = getIloscPaliwa() - rodzajNapedu.getPoborPaliwaSilnika();
        poziomNaladowaniaAkumulatorow = getPoziomNaladowaniaAkumulatorow() - rodzajNapedu.getPoborPraduSilnika();
        System.out.println("Przyspieszam: ");
    }

    public void zwolnij() {
        if (predkosc >= 0) {
            predkosc = (int) (predkosc - rodzajNapedu.getMocSilnika() * 0.2);
            System.out.println("Zwalniam");
        }else {
            System.out.println("Nie mogę bardziej zwolnić");
        }
    }


}
