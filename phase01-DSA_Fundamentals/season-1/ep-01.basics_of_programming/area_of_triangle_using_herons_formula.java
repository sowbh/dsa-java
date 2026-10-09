import java.util.*;
import java.lang.*;

public class area_of_triangle_using_herons_formula
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /* write your code here */
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double s = (a + b + c) / 2.0;

            double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.printf("%.2f%n", A);
        }

    }
}