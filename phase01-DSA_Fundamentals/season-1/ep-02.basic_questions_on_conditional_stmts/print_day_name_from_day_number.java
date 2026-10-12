import java.util.*;
import java.lang.*;

public class print_day_name_from_day_number {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IO.println("Enter a day number (1-7): ");
        int day = sc.nextInt();
        printDay(day);
    }

    public static void printDay(int day) {
        // Write your logic here 
        if(day == 1){
            IO.println("Monday");
        } else if(day == 2){
            IO.println("Tuesday");
        } else if(day == 3){
            IO.println("Wednesday");
        } else if(day == 4){
            IO.println("Thursday");
        } else if(day == 5){
            IO.println("Friday");
        } else if(day == 6){
            IO.println("Saturday");
        } else if(day == 7){
            IO.println("Sunday");
        } else{
            IO.println("Invalid day number");
        }
      
    }
}