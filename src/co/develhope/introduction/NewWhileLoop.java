package co.develhope.introduction;

public class NewWhileLoop {
    public static void main(String[] args) {
         /*
        Un ciclo (loop) significa fare qualcosa tante volte.
        Quante volte? Dipende: finché non hai finito, finché non succede qualcosa, 10 volte, 100 volte...

        Esistono vari tipi di cicli:
        - while
        - do/while
        - for/foreach
         */

        // ho dichiarato una variabile di tipo int e le ho assegnato il valore 10000
        int totPounds; // dichiarazione
        totPounds = 10000; // assegnazione

        int daysCount = 0;

        /*
        vogliamo fare un'operazione ogni giorno.
            questa operazione è:
            - calcola il tasso di oggi
            - se è > 1.15 vendi 1000 pounds
            - se è < 1.15 non vendere
         procedo finché non ho finito i soldi
         obiettivo: scoprire quanti giorni ci sono voluti.
         */



        while (totPounds > 0) {
            double todaysRate = 1 + (Math.random() * 0.2);
            if (todaysRate > 1.15) {
                totPounds = totPounds - 1000;
                System.out.println("The rate is " + todaysRate + " which is good, so i sell. Now I have " + totPounds);
            } else {
                System.out.println("The rate is " + todaysRate + " which is bad, so i don't sell.");
            }
            daysCount += 1;
        }

        System.out.println(daysCount + " have passed and now I am safe!");



    }
}
