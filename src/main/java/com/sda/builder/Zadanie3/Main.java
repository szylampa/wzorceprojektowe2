package com.sda.builder.Zadanie3;

/**
 * Stworzymy aplikację symulującą komunikację między użytkownikami. Aplikacja będzie działać na zasadzie pokoju chat'owego.
 * <p>
 * Stwórz klasę Mail która posiada pola:
 * - tresc
 * - nadawca
 * - data nadania
 * - data odbioru
 * - adres ip nadania
 * - adres ip odebrania
 * - nazwe serwera posredniego
 * - nazwe skrzynki pocztowej
 * - protokol komunikacji
 * - typ wiadomości (UNKNOWN, OFFER, SOCIAL, NOTIFICATIONS, FORUM)
 * - flagę(boolean) - czy szyfrowane
 * - flagę(boolean) - isSpam
 * <p>
 * Stwórz klasę Client która:
 * - posiada pole name
 * - posiada pole List<Mail> - lista/skrzynka wiadomości klienta
 * - readMail(Mail m) - która powoduje dodanie wiadomości do skrzynki i wypisanie komunikatu:
 * "Klient " + this.getName() + " otrzymal maila"
 * <p>
 * Stwórz klasę MailServer która posiada listę podłączonych klientów (pole klasy). Metody:
 * - connect(Client c) - powoduje podłączenie klienta do serwera, czyli dodanie go do listy ( tej która jest polem klasy)
 * - disconnect(Client c) - powoduje odłączenie klienta
 * - sendMessage(Mail m, Client sender) - powoduje rozesłanie wiadomości do wszystkich klientów oprócz nadawcy.
 * Przed przekazaniem wiadomości należy ustawić jej datę odebrania na teraz (now()).
 */
public class Main {
    public static void main(String[] args) {

        MailServer mailServer = new MailServer();
        Mail.Builder builder = new Mail.Builder();

        mailServer.connect(new Client("Marian"));
        mailServer.connect(new Client("Zbyszek"));
        mailServer.connect(new Client("Franek"));

        mailServer.sendMessage(builder.createMail(), new Client("****"));
    }
}
