package co.develhope.introduction;

import java.time.LocalDate;


public class DateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        /* Calcola il numero di giorni rimanenti fino alla fine del mese corrente
        int daysLeftMoth = today.lengthOfMonth() - today.getDayOfMonth();
        System.out.println("How many days are left till the end of the month ? " + daysLeftMoth);*/
        // calcola numero di giorni rimanenti alla fine dell'anno
        int daysLeftYear = today.lengthOfYear() - today.getDayOfYear();
        System.out.println(daysLeftYear);

    }
}
