package co.develhope.introduction;

public class WhileLoop {
    public static void main(String[] args) {
        //create a variable integer
        int pounds = 10000;
        /*create a varibale with a Math. operation, Random
        for a casual number beetween 1 and 12.*/
        double exchangeRate = 1 + (Math.random() * 0.2);
        //create a varibale days
        int days = 0;
        //create a while loop to Increment the number of days
        while (pounds >= 1000 && exchangeRate <= 1.15) {
            days++;
        /*calculate the amount of euros to sell by
            multiplying 1000 with the exchange rate

         */
            double eurosToSell = 1000 * exchangeRate;
            // Subtract the sold pounds from the total
            pounds -= eurosToSell;
            
            exchangeRate = 1 + (Math.random() * 0.2);
            //print days to sell
            System.out.println("Number days to sell = " + days);
        }
    }
}
