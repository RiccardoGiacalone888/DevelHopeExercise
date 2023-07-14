package co.develhope.introduction;

public class TestingClass {
    public static void main(String[] args) {
        int a = 15;

        // Add 5 to a without repeating the variable
        a += 5;

        // Subtract 4 from a without repeating the variable
        a -= 4;

        // Assign the value of a  to int b and increment b by one
        int b = a++;

        // Check if b is an odd number
        boolean statement1 = (b % 2 != 0);

        // Check if the result of (b multiplied by b + 1) is a multiple of 3
        boolean statement2 = ((b * (b + 1)) % 3 == 0);


        System.out.println("Statement 1: " + statement1);
        System.out.println("Statement 2: " + statement2);
    }
}
