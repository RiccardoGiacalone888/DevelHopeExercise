package co.develhope.introduction;

public class House {
    private String address;
    private int numberOfFloors;

    public House(String address, int numberOfFloors) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("A house object is created.");
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}


/**Parte di codice relativa la classe tester su cui utilizzare
 * la suddetta classe
 * Autore: Giacalone Riccardo
 */


public class tester {
    public static void main(String[] args) {
        House house1;
        House house2;
        house1= new House ("via linconl 161", 32);
        house2= new House ("Lungo mare C.C. 750" , 1);

    }

}

