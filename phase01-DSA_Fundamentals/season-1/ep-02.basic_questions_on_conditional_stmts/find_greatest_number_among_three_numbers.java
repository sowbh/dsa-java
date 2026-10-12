import java.util.*;
import java.lang.*;

public class find_greatest_number_among_three_numbers {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int greatest = findGreatest(a, b, c);
        IO.println("The greatest number is: " + greatest);
    }

    public int findGreatest(int a, int b, int c) {

        //write your code here
        if(a > b){
            if(a > c){
                return a;
            } else {
                return c;
            }
        } else if(b > c){
            return b;
        } else {
            return c;
        }

    }
}