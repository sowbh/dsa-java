import java.util.*;
import java.lang.*;

public class multiplication_table_of_an_integer {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Multiplication Table of "+ n + " :");
        for(int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}