//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console



import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data);
        System.out.println(data.format(DateTimeFormatter.ofPattern("dd", Locale.ITALY)));
        System.out.println(data.format(DateTimeFormatter.ofPattern("MMMM", Locale.ITALY)));
        System.out.println(data.format(DateTimeFormatter.ofPattern("yyyy", Locale.ITALY)));

        System.out.println(DayOfWeek.FRIDAY);
    }
}