import java.util.*;
import java.lang.*;

public class print_natural_numbers_from_n_to_1 {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");

        int n = sc.nextInt();

        for(int i=n; i>=1; i--){
            System.out.print(i + " ");
        }
    }
}
