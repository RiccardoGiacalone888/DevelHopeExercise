package co.develhope.introduction;
/**
 * Questa classe fornisce metodi per manipolare nomi e cognomi
 * Autore : Giacalone Riccardo
 */


public class WordGames {
    /**
     * Aggiunge "Hello" davanti alla parola fornita come parametro.
     *
     * @param word la parola a cui aggiungere "Hello"
     * @return la stringa "Hello [wordHere]"
     */
public String addHelloWord (String word){return "Hello " + word;}
    /**
     * Restituisce la concatenazione del nome e del cognome forniti come parametri.
     *
     * @param name    il nome
     * @param surname il cognome
     * @return la concatenazione del nome e del cognome
     */
    public  String getFullName (String name , String surname){return name + "  " + surname; }

}


/**
 * Questa classe contiene il metodo main per testare la classe WordGames.
 * Autore: Giacalone Riccardo
 */

public class TesterJavadoc {
    /**
     * Il metodo main è il punto di ingresso del programma.
     *
     * @param args gli argomenti della riga di comando (non utilizzati in questo caso)
     */

    public static void main(String[] args) {
        // Crea un nuovo oggetto WordGames
        WordGames wordGames = new WordGames();
        // Stampa il risultato dell'invocazione del metodo addHelloWord
        String helloWorld = wordGames.addHelloWord("World");
        System.out.println(helloWorld);
        // Stampa il risultato dell'invocazione del metodo getFullName
        String fullName = wordGames.getFullName("Riccardo", "Gicalone");
        System.out.println(fullName);
    }
}

