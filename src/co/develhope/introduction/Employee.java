package co.develhope.introduction;

public class Employee {
    public String name;
    public String surname;
    public String address;

    //costruttore
    public  Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        name = newEmployeeName;
        surname = newEmployeeSurname;
        address = newEmployeeAddress;
    }
    //metodo per ottenere i dettagli Employee
        public String getEmployeeDetails () {
            return "Name" + name + "Surname" + surname + "n/Address" + address;
        }

    }


    /*
    public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    //metodo privato che incrementa di 1 il totalNumbersOfEmployee
    private static void keepTrackOfEmployeesNumber(){totalNumberOfEmployees++;}
    //metodo privatato per l'ID
    private String generateBadgeIdCode(){
        String randomCode1= "XYZ";
        String randomCode2= "ZXY";
        return randomCode1 + employee.name + employee.surname + randomCode2;


    }
    //Metodo pubblico per mostrare i dettagli della Badge
    public void showBadgeDetails(){
        System.out.println("The total number of employee tracked by the badges " + totalNumberOfEmployees);
        System.out.println("The details of the employee " + employee.getEmployeeDetails());
        System.out.println("Badge ID cose is: " + badgeIdCode);
    }

    public Badge( Employee employeeThatNeedsBadge){keepTrackOfEmployeesNumber();
    employee = employeeThatNeedsBadge;
    badgeIdCode = generateBadgeIdCode();
    }
};


     */

/*
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
 */


