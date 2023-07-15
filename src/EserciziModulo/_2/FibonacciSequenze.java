package EserciziModulo._2;

public class FibonacciSequenze {
    public static void main(String[] args) {
        int dimension = 10;
        int first = 0;
        int increment = 1;
        for (int i = 2; i < dimension; i++) {
            int next = first + increment;
            System.out.print(", " + next);

            first = increment;
            increment = next;
        }








    }
}
