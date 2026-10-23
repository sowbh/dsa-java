import java.util.*;
import java.lang.*;

public class calculate_salary_based_on_constraints {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the gender: ");
        char gender = sc.next().charAt(0);

        System.out.println("Enter year of service: ");
        int yoservice = sc.nextInt();

        System.out.println("Enter qualification: ");
        char qualification = sc.next().charAt(0);

        if( gender == 'M'){
            if(yoservice >= 10 && qualification == 'P'){
                System.out.println(15000);
            } else if(yoservice >= 10 && qualification == 'U'){
                System.out.println(10000);
            } else if(yoservice < 10 && qualification == 'P'){
                System.out.println(10000);
            } else if(yoservice < 10 && qualification == 'U'){
                System.out.println(7000);
            }
        } else if(gender == 'F'){
            if(yoservice >= 10 && qualification == 'P'){
                System.out.println(12000);
            } else if(yoservice >= 10 && qualification == 'U'){
                System.out.println(9000);
            } else if(yoservice < 10 && qualification == 'P'){
                System.out.println(10000);
            } else if(yoservice < 10 && qualification == 'U'){
                System.out.println(6000);
            }
        }
    }
}