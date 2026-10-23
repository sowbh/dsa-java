import java.util.*;
import java.lang.*;

public class calculate_electricity_bill_based_on_units_consumed {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */

        System.out.println("Enter the unit: ");
        int unit = sc.nextInt();
        double amt = 0;

        if(unit > 400){
            amt = (unit-400) * 13;
            unit = 400;
        } 
        if(unit > 200 && unit <=400){
            amt += (unit-200) * 8;
            unit = 200;
        }
        if(unit > 100 && unit <= 200){
            amt += (unit-100) * 6;
            unit = 100;
        }
        amt += unit * 4.2;
        System.out.println("Bill amount: " +amt);
    }
}