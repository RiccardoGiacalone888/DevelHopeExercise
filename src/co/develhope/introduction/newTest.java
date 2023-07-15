package co.develhope.introduction;

import java.util.Scanner;

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
