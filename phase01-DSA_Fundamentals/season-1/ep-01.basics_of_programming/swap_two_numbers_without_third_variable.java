import java.util.*;

public class swap_two_numbers_without_third_variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b= sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // method-1
        a=a+b;
        b=a-b;
        a=a-b;

        // method-2
        /* a= a^b;
           b= a^b;
           a= a^b; 
        */

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
} 
