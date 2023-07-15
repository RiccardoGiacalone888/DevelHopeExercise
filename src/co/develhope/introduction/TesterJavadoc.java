package co.develhope.introduction;

public class TesterJavadoc {
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();
        String helloWorld = wordGames.addHelloWord("World");
        System.out.println(helloWorld);
        String fullName = wordGames.getFullName("Riccardo", "Gicalone");
        System.out.println(fullName);
    }
}
