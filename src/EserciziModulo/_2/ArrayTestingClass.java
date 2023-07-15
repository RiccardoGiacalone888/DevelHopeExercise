package EserciziModulo._2;

public class ArrayTestingClass {
    public static void main(String[] args) {
        String[] aliceTodos = {"Coding", "Reading", "Learning"};
        String[] bobTodos = {"Reading", "Coding", "Learning", "Sleeping"};
        String[] timTodos = {"Reading", "Learning", "Coding"};
        // Stampa i compiti di Alice
        System.out.println("Compiti di Alice:");
        for (String task : aliceTodos) {
            System.out.println(task);
        }
        System.out.println();

        // Stampa i compiti di Bob
        System.out.println("Compiti di Bob:");
        for (String task : bobTodos) {
            System.out.println(task);
        }
        System.out.println();

        // Stampa i compiti di Tim
        System.out.println("Compiti di Tim:");
        for (String task : timTodos) {
            System.out.println(task);
        }
    }
}