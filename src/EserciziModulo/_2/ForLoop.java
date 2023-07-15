package EserciziModulo._2;

public class ForLoop {
    public static void main(String[] args) {
        String[] arr = {
                "Lunedì",
                "Martedì",
                "Mercoledì",
                "Giovedì",
                "Venerdì",
                "Sabato",
                "Domenica"
        };

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { // Verifica se l'indice è pari
                arr[i] = arr[i].toUpperCase(); // Converti il valore dell'elemento in maiuscolo
            }
        }

// Stampa l'array modificato
        for (String giorno : arr) {
            System.out.println(giorno);
        }

    }
}
//if verifica se l'indice è pari (i % 2 == 0). Se l'indice è pari, il valore dell'elemento corrispondente viene convertito in maiuscolo utilizzando il metodo toUpperCase().
//
//Infine, viene utilizzato un ciclo for-each per stampare l'array modificato. Ogni elemento dell'array verrà stampato su una riga separata utilizzando System.out.println().
//
//Quando esegui il programma, vedrai l'output che mostra i nomi dei giorni della settimana con i valori modificati in maiuscolo ogni 2 elementi, a partire da "Lunedì".