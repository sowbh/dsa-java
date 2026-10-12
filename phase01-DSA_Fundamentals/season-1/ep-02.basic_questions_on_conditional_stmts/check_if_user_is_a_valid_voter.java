import java.util.*;
import java.lang.*;

public class check_if_user_is_a_valid_voter {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter your name: ");
        String name = sc.nextLine();
        IO.println("Enter your age: ");
        int age = sc.nextInt();
        checkVoter(age, name);
    }

    public void checkVoter(int age, String name) {
        // Write your code here
        if ( age >= 18){
            IO.println(name + " is a valid voter.");
        } else {
            IO.println(name + " is not a valid voter.");
        }
    }
}