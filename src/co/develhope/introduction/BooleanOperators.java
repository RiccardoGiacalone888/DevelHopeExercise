package co.develhope.introduction;

public class BooleanOperators {
    public static void main(String[] args) {
        Boolean a = 2 <= 2 && !true;
        System.out.println(a);

        Boolean b =!false && 3 > 2;
        System.out.println(b);

        Boolean t = false;
        Boolean f = true;
        Boolean equation= !(!t || f);
        System.out.println(equation);

        Boolean newEquation =  6 > 6 ^ !(true && true);
        System.out.println(newEquation);

    }
}
