import java.util.*;
import java.lang.*;

public class calculate_final_amount_after_discount {
    void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    /* write your code here */   
    System.out.println("Enter amount: ");    
    int amt = sc.nextInt();
    int dis = 0;

    if(amt > 0 && amt <= 5000){
        dis = 0;
    } else if(amt > 5000 && amt <= 7000){
        dis = 5;
    } else if(amt > 7000 && amt <= 9000){
        dis = 10;
    } else if(amt > 9000){
        dis = 20;
    }

    int disA = amt - (amt*dis)/100;

    System.out.println("Final Amount: "+disA);
         
    }
}