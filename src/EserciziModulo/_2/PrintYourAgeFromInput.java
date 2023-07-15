package EserciziModulo._2;

import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //create a new Scanner



        int age = input.nextInt(34); // read the integer number input from user



        input.close(); // close the scanner (do not read anymore the user input)

    }
}
