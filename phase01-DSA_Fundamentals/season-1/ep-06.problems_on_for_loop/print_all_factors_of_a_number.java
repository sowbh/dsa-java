import java.util.*;
import java.lang.*;

public class print_all_factors_of_a_number {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n/2; i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.print(n + " ");
    }
}