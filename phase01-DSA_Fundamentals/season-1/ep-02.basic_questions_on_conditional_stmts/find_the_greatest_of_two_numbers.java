import java.util.*;
import java.lang.*;

public class find_the_greatest_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("The greatest number is: " + a);
        } else {
            System.out.println("The greatest number is: " + b);
        }
    }
}
