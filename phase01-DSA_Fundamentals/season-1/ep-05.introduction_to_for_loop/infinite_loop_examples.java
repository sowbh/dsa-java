import java.util.*;
import java.lang.*;

public class infinite_loop_examples {
    void main(String[] args) {
        // initialize; condition; update are optional but if we skip anything then it is infinite loop

        // ex 1 for infinite loop
        // skip update;

        // for(int i=1; i<=5;){
        //     System.out.println("Hi");
        // }

        // here i is always 1 so loop executes infinitely.

        // *****

        // ex 2 - skip condition n update

        // for(int i=1; ;){
        //     System.out.println("hello");
        // }

        // for loop is valid but runs infinitely

        // *****

        // ex 3 - skip everything but 2 semicolons (;) are mandatory

        // for(;;);

        // System.out.println("good day");

        // for loop is valid but the it wont reach sout()

    }
}