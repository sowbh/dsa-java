import java.util.*;
import java.lang.*;

class Solution {

    public static void factorial(int n) {
        long fact =1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}

public class factorial_of_a_number {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");

        int n= sc.nextInt();

        Solution.factorial(n);
    }
}