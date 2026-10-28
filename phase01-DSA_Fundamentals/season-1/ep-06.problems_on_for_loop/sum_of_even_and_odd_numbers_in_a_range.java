import java.util.*;
import java.lang.*;

public class sum_of_even_and_odd_numbers_in_a_range {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */
         
        System.out.println("Enter range of even: ");

        int start = sc.nextInt();

        System.out.println("Enter range of odd: ");

        int end = sc.nextInt();

        int evenSum=0, oddSum =0;

        if(start>end){
            int temp= start;
            start = end;
            end= temp;
        }
        
        for(int i=start; i<=end; i++){
            if(i%2==0) evenSum+=i;
            else oddSum+=i;
        }

        
        System.out.println("Even Sum = " +evenSum);
        System.out.println("Odd Sum = "+oddSum);
    }
}

