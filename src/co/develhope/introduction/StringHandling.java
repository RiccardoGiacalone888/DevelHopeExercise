package co.develhope.introduction;

public class StringHandling {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Ho are you?";
        char[] charArray = new char[4];
        charArray[0] = string1.charAt(0);
        charArray[1] = string1.charAt(1);
        charArray[2] = string2.charAt(string2.length()-2);
        charArray[3] = string2.charAt(string2.length()-1);
        System.out.println(charArray);


    }
}