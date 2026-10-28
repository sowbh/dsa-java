import java.util.*;
import java.lang.*;

public class sum_of_all_factors_of_a_number {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if(n%i == 0)
                sum += i;
        }
        System.out.println(sum);
    }
}