package com.sda.builder.Zadanie2;

/**
 * Zadanie pieczątka.
 * Stwórz klasę Stamp która posiada pola:
 * firstDayNumber, - pierwsza cyfra daty (dnia)
 * secondDayNumber,- druga cyfra daty (dnia)
 * firstMonthNumber,- trzecia cyfra daty (miesiac)
 * secondMonthNumber, - czwarta cyfra daty (miesiac)
 * yearNumber1; - piata cyfra daty (rok)
 * yearNumber2; - szosta cyfra daty (rok)
 * yearNumber3; - siodma cyfra daty (rok)
 * yearNumber4; - osma cyfra daty (rok)
 * <p>
 * caseNumber = numer sprawy (int);
 * <p>
 * jak robimy pieczatke to mamy w niej pokretla ktore obracamy aby wybrac obecna date. np. ustawiam numerki na:
 * <p>
 * firstDayNumber:   1
 * secondDayNumber:  3
 * firstMonthNumber: 0
 * secondMonthNumber:5
 * yearNumber1:      2
 * yearNumber2:	  0
 * yearNumber3:	  1
 * yearNumber4:	  7
 * caseNumber:	20
 * <p>
 * w wyniku poda:
 * 13-05-2017:20
 * <p>
 * Stamp ma byc tworzony za pomoca buildera. Domyslnie jesli nie podamy wartosci to domyslne wartosci to:
 * firstDayNumber:   0
 * secondDayNumber:  1
 * firstMonthNumber: 0
 * secondMonthNumber:1
 * yearNumber1:      2
 * yearNumber2:	  0
 * yearNumber3:	  0
 * yearNumber4:	  1
 * caseNumber:	1
 */
public class Main {
    public static void main(String[] args) {
        Stamp.Builder builder = new Stamp.Builder();
        System.out.println(builder.createStamp()); // defaultowy stamp
        System.out.println(builder.setFirstDayNumber(1).setSecondDayNumber(3).setFirstMonthNumber(0).setSecondMonthNumber(5).setYearNumber1(2).setYearNumber2(0).
                setYearNumber3(1).setYearNumber4(7).setCaseNumber(20).createStamp());
    }
}
