import java.util.*;
import java.lang.*;

public class basic_problems {
    void main(String[] args) {

        // ex 1
        for(int i=0; i<=3; i++){
            System.out.println("Hello Java!");
        }
        
        System.out.println("***********");

        // ex 2
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);
        
        System.out.println("***********");
        
        // ex 3
        for (int i = 10; i >= 1; i -= 3) {
            System.out.println(i);
        }

        System.out.println("***********");

        // ex 4
        int i;
        for(i=1; i<=5; i++){
            System.out.println("Hey there!");
        }
        System.out.println("This loop fails or stops at: "+i);
    }
}