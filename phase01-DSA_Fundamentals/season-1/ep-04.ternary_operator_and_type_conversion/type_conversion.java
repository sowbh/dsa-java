import java.util.*;
import java.lang.*;

public class type_conversion {
    void main(String[] args) {

        // 1. implicit / widening conversion;
        // converts a smaller data type into a larger compatible data type

        int num = 10;
        double result = num;

        System.out.println(num); // 10
        System.out.println(result); // 10.0

        long x = 5000L;
        float y = x; // long → float

        System.out.println(x); // 5000
        System.out.println(y); // 5000.0

        char ch = 'A';
        int code = ch; // char → int

        System.out.println(ch); // A
        System.out.println(code); // 65

        // 2. explicit / narrowing
        double num1 = 10.75;
        int res = (int) num1;  // double → int

        System.out.println(num1); // 10.75
        System.out.println(res);  // 10

        int num2 = 130;
        byte result1 = (byte) num2; // int → byte

        System.out.println(result1); // -126

        int num3 = 65;
        char ch1 = (char) num3; // int → char

        System.out.println(ch1); // A

    }
}