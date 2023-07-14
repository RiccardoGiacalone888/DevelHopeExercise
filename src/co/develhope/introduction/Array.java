package co.develhope.introduction;

public class Array {
    public static void main(String[] args) {
        String[] carBrand = {"Fiat", "Ferrari", "Lamborghini", "BMW", "Mustang"};
        System.out.print(carBrand[2]);
        Integer[] primeNumbers = new Integer[6];
        primeNumbers[0] = 1;
        primeNumbers[1] = 2;
        primeNumbers[2] = 3;
        primeNumbers[3] = 4;
        primeNumbers[4] = 5;
        primeNumbers[5] = 6;
        System.out.print("array content");
        for ( int i = 0;
        i < primeNumbers.length;
        i++){
            System.out.print(primeNumbers[i]);


        }
    }
}
