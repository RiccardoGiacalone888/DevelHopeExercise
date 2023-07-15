package EserciziModulo._2;

public class PrintYourNameAndPi {
    public static void main(String[] args) {
//create a string with my name
        String yourName = "Riccardo";
        //create a variable named pi
        double pi = 3.141590;
        // use pitnfn to print formatted strings using %S%n for your name and %f%n for pi
        System.out.printf("%S%n",yourName);
        System.out.printf("Il numero Pi è: %.6f%n", pi);
    }
}
