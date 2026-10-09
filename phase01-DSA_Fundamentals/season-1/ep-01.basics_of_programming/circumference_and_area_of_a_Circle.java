import java.util.*;
import java.lang.*;

public class circumference_and_area_of_a_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float r = sc.nextFloat();

        double c = 2 * Math.PI * r;

        double A = Math.PI * r * r;

        System.out.printf("%.2f%n", c);
        System.out.printf("%.2f%n", A);
    }
}