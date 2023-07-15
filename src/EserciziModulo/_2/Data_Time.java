package EserciziModulo._2;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Data_Time {
    public static void main(String[] args) {
// // Ottiene l'istanza corrente di LocalDateTime
        /*LocalDateTime now = LocalDateTime.now();
//  // Crea un oggetto DateTimeFormatter con il formato desiderato
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd  MMMM  yy  HH:mm");
//// Formatta l'oggetto LocalDateTime utilizzando il formatter
        String formatterDataTime =  now.format(formatter);

        System.out.println(formatterDataTime); */



        ZonedDateTime today = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        String formatterDateTime = today.format(formatter);
        System.out.println(formatterDateTime);

    }
}
