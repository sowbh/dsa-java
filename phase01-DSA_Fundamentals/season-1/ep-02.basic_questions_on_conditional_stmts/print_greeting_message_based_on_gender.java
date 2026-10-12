import java.util.*;
import java.lang.*;

public class print_greeting_message_based_on_gender {
    void main() {

    //Write your code here 
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your gender (M/F): ");
    String gender = sc.nextLine();

        if (gender.equalsIgnoreCase("M")) {
            IO.println("Hello, Sir!");
        } else if (gender.equalsIgnoreCase("F")) {
            IO.println("Hello, Ma'am!");
        } else {
            IO.println("Hello, Guest!");
        }
    }
}