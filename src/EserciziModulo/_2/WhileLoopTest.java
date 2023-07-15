package EserciziModulo._2;

import java.util.Random;
import java.util.Scanner;

public class WhileLoopTest {
    public static void main(String[] args) {
        System.out.println("WELCOME!"); // print Welcome!
        Random random = new Random(); // genera un numero casuale tra 1 e 10
        int number = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess; //credo la varibiale guess che mi sarà utile per l'utente
        // creo un ciclo do-while
        do {
            System.out.println("Guss the number between 1 and 10"); // chiedo di indovinare il numero
            guess = scanner.nextInt(); //legge l'input dell'utente
            /*con if dico che se guess è uguale a number,
            l'utente ha indovitano il numero e appare un messaggio
            di vittoria
             */
            if (guess == number) {
                System.out.println("Bravo sei come Richi, you win!");
                //messaggio che appare se si sbaglia
            } else {
                System.out.println("Riprova cosa inutile");
            }

            /*se il numero è diverso da quello presente in number con il random
            in console continuarà a chiedermi il numero
             */
        } while (guess != number) ;
        }
    }




