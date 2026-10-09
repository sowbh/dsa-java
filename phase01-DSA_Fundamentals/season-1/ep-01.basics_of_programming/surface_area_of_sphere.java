import java.util.*;
import java.lang.*;

public class surface_area_of_sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        
        double A = 4 * Math.PI * r * r;

        System.out.println(A);
    }
}