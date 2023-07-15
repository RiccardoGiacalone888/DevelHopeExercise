package co.develhope.introduction;

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

