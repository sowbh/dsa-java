import java.util.*;
import java.lang.*;

public class sum_upto_n_terms {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}