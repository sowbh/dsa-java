import java.util.*;

public class compound_interest_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double r = sc.nextDouble();
        int t = sc.nextInt();
        int n = sc.nextInt();

        double A = p * Math.pow(1 + (r / n) , n * t);

        double CI =  A - p; 

        System.out.printf("%.2f%n", CI);

    }
}