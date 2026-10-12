import java.util.*;
import java.lang.*;

public class check_if_a_number_is_even_or_odd {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            IO.println("The number is even.");
        } else {
            IO.println("The number is odd.");
        }
    }
}
