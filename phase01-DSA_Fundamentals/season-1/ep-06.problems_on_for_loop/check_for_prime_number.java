import java.util.*;
import java.lang.*;

class Solution{
    public boolean isPrime(int n) {
        /*Write your code here*/
        boolean yesPr = true;
        if(n<=1){
            return false;
        } else if(n==2){
            return true;
        } else if(n%2==0){
            return false;
        } else{
            for(int i=3; i<=Math.floor(Math.sqrt(n)); i+=2){
                if(n%i==0){
                    yesPr = false;
                    break;
                }
            }
            return yesPr;
        }
    }
}

public class check_for_prime_number {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        Solution obj = new Solution();
        boolean res = obj.isPrime(n);

        System.out.println(res ? "Prime" : "Not Prime");
    }
}