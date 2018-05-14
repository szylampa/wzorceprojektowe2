package com.sda.abstractfactory.Zadanie3;

/*Stwórz aplikację, która jest aplikacją zgloszeniową do dziekanatu. Wyobraźcie sobie uczelnię, która posiada system webowy do dziekanatu. Taki system pozwala
 skladać zażalenia, wnioski, oraz różne inne pisma. Czasami problem jest taki, że aby wysłać wniosek trzeba wiedzieć co w nim napisać. Ułatwimy to użytkownikowi
 poprzez stworzenie szablonów formularzy, które będą tworzone przez Fabrykę Abstrakcyjną.

        Stwórz klasę Application (od wniosek) która będzie reprezentować pojedynczy wniosek/pismo które możemy złożyć do dziekanatu. Klasa powinna nie być abstrakcyjna.
         Powinna posiadać pola:
        - dataUtworzenia (LocalDateTime)
        - miejsceUtworzenia (String)
        - daneAplikanta (Person)
        - treść (String)

        Po tej klasie powinny dziedziczyć inne klasy (umieść klasę Application oraz klasy dziedziczące w jednej/oddzielnej paczce): klasa ConditionalStayApplication,
        SchoolarshipApplication, SocialSchoolarshipApplication, SemesterExtendApplication

        Wszystkie dziedziczą po klasie Application. Każdy z nich posiada konstruktor i:
        ConditionalStayApplication – posiada dodatkowo pole „oceny(grades)” (Lista liczb typu double) oraz pole reason (powód) – String.

        SchoolarshipApplication – posiada dodatkowo pole grades (tak samo jak wyżej) oraz extracurricularActivities (zajęcia dodatkowe) które są listą stringów.

        SocialSchoolarshipApplication – posiada pole grades, oraz totalFamilyIncome (double).

        SemesterExtendApplication – posiada pole reason (String).

        Stwórz fabrykę abstrakcyjną która posiada 5 metod Factory tworzących obiekty i wypełniając domyślne pola tych klas.

        Person jest klasą która posiada pola : Imie, nazwisko oraz numer indeksu.
        Stwórz aplikację która pyta o imię, nazwisko oraz numer indeksu użytkownika,
        a następnie pyta jaki typ formularza chce wypełnić, następnie prosi o dane do wypełnienia tego formularza.

        np.
        Podaj imię i nazwisko, oraz numer indeksu:
        Paweł Recław 00007

        Jaki typ formularza chcesz wypełnić (Warunek/StypendiumNaukowe/StypendiumSocjalne/WydluzenieSemestru)?
        StypendiumSocjalne

        Podaj swoje oceny oddzielone przecinkami:
        1, 2, 3, 5, 5, 2, 3, 3

        Podaj średni dochód na członka rodziny:
        50.15 zł

        Dziękuję, Twój formularz został wysłany.
        (Dla chętnych - DOPISZ zawartość formularza do pliku forms.txt)
        (Zakończ aplikację)
*/
public class Main {
    public static void main(String[] args) {

    }
}
