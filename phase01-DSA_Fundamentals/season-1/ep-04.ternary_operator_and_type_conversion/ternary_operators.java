import java.util.*;
import java.lang.*;

public class ternary_operators {
    void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // ex1
        // System.out.println("Enter a: ");
        // int a = sc.nextInt();

        // System.out.println("Enter b: ");
        // int b = sc.nextInt();

        int a =2;
        int b = 7;

        // int max;

        // if(a > b){
        // max = a;
        // } else {
        // max = b;
        // }
        // System.out.println("Maxiumum: " + max);

        // shortform for if else is ternary operator;

        // either store in a variable
        // max = a > b ? a : b;
        // System.out.println("Maximum: " +max);

        // print directly;
        System.out.println("Maximum: " + (a > b ? a : b)); // 7

        // *****

        // ex2
        int num1 = 10;
        double num2 = num1 >= 10 ? num1 : -num1;

        System.out.println("num2 = " + num2); // 10.0

        // *****

        // nested ternary operator
        int characters = 5;
        int story = 3;
        double movieRating = characters <= 4 ? 3 : story > 1 ? 2 : 1;

        System.out.println(movieRating); // 2.0

    }
}