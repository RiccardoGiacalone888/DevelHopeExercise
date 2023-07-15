package co.develhope.introduction;

public class TesterStatic {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Riccardo" , "Giacalone",
                "Via Lincoln 161");
        Employee employee2 = new Employee("Eleonora", "Melodia",
                "Via Lincoln 161");
        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

badge1.showBadgeDetails();
System.out.println(".........................");
badge2.showBadgeDetails();
    }
}
