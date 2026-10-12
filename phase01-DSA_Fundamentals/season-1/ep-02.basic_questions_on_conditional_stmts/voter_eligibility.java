import java.util.*;
import java.lang.*;

public class voter_eligibility {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter your name: ");
        String name = sc.nextLine();
        IO.println("Enter your age: ");
        int age = sc.nextInt();
        String result = checkVoterStatus(age, name);
        IO.println(result);
    }

    public String checkVoterStatus(int age, String name) {
        // Write your code here
        
        if (age >= 18) {
            return name + " is a valid voter.";
        } else {
            int x = 18 - age;
            if (x == 1) {
                return name + " is not a valid voter.\n" + name + " will be eligible in 1 year.";
            } else {
                return name + " is not a valid voter.\n" + name + " will be eligible in " + x + " years.";
            }
        }
    }
}