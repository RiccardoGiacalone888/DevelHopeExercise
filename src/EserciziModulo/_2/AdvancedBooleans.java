package EserciziModulo._2;

import javax.swing.text.StyledEditorKit;

public class AdvancedBooleans {
    public static void main(String[] args) {
        Boolean A = !(!(!(false ^ false) || (true && true)));
        System.out.println(A);
        int x = 3;
        int y = 2;

        Boolean result =  !((x * y) <= 6) && (x - y != 1);
        System.out.println(result);
        int a = 1;
        int b = 3;
        int c = a * b;
        int d = c;
        Boolean exercise = (d / c + 2) >= b || !(c + b - c / a == 3);
        System.out.println(exercise);

        int z = 5;
        int w = 6;
        Boolean t = true;
        Boolean f = false;
        Boolean program =  ((x * x - y * y / 2 != 12) || !t && f);
        System.out.println(program);



    }


    }

