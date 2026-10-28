import java.util.*;
import java.lang.*;

class Solution {
    public static int power(int a, int b) {
        //write you code here
        int res=1;
        for(int i=1; i<=b; i++){
            res*=a;
        }
        return res;
    }
}

public class calculate_power_of_a_number {
    void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = sc.nextInt();

        System.out.println("Enter y: ");
        int y = sc.nextInt();

        int result = Solution.power(x,y);

        System.out.println(result);
    }
} 
    

