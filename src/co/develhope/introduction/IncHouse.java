package co.develhope.introduction;

import java.util.Scanner;

public class IncHouse {
    private int floorsNumber;
    private String address;
    private String[] residentsNames;

    public int getFloorsNumber(){return floorsNumber;};
    public void setFloorsNumber(int floorsNumber) {this.floorsNumber= floorsNumber;};

    public String getAddress(){return address;};
    public void setAddress(String address) {this.address=address;};

    public String[] getResidentsNames() {
        return residentsNames;
    };

    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    };
}

/**
 * Parte del tester relativa la suddetta classe
 * Autore: Giacalone Riccardo
 */
public class newTest {
    public static void main(String[] args) {
        IncHouse incHouse = new IncHouse();
        Scanner scanner = new Scanner(System.in);
        System.out.println("numbers of flor");
        int floors = scanner.nextInt();
        scanner.nextInt();
        System.out.println("home address");
        String address = scanner.nextLine();
        System.out.println ("numbers of persons in the house");
        String nameInput = scanner.nextLine();
        String[] names = nameInput.split(" , ");

        IncHouse.setFloorsNumber(floors);
        house.setAddress(address);
        house.setResidentsNames(names);
    }
}
