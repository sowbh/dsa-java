import java.util.*;
import java.lang.*;

public class check_if_a_year_is_a_leap_year {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            IO.println("Leap Year");
        } else {
            IO.println("Not a Leap Year");
        }
    }
}