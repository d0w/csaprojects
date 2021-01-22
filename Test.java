import java.util.*;

public class Test {
    public static void main(String[] args) {
        String hello = "Hello world";
        System.out.println(hello);
        
        String name = "Value";
        int number = 3;
        double double1 = 3.5;
        char char1 = 'a';
        boolean bool = false;

        int declaration;

        declaration = 1;
        System.out.println(declaration);
        if (declaration == 1) {
            System.out.println("true");
        }


        int int1;
        int1 = 5 + 3;   //8
        int1 = 5 - 2;   //3
        int1 = 5 * 2;   //10
        int1 = 5 / 3;   //1 (int)
        int1 = 5 % 2;   //1 (remainder)
        double dob = 5 / 3;
        //5/3 ~ 1.525
        
        int1 = 5 + 3 * 8;

        int1 = 1;
        int1 = int1 + 5;
        int1++; //add 1 to any variable
        int1--; //subtract 1 from any variable

        System.out.println(int1);
        



    }
}