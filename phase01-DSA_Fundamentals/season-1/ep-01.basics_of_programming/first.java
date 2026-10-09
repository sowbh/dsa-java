import java.util.*;

public class first {
    public static void main(String[] args) {
        System.out.println("Hi");
        System.out.println("Hello");

        // int age=20;
        // System.out.println(age);

        // byte a=128;
        // System.out.println(a);

        Scanner sc = new Scanner(System.in);
        // int a=sc.nextInt();

        // System.out.println("Value of a= "+a);

        // String s=sc.nextLine();
        // System.out.println(s);

        // char c=sc.nextLine().charAt(3);
        // System.out.println(c);

        /* ***** */

        System.out.println("Age:");
        int age=sc.nextInt();

        sc.nextLine(); // Consume the newline character left by nextInt()

        System.out.println("Enter name:");
        String name=sc.nextLine();

        System.out.println("My name is " + name + ", and Age: " + age);

        String str="Hello";
        int p =10;

        System.out.println(str + p); // Hello10

        // but
        // System.out.println(str - p); //Syntax Error

        int x=10;
        int y=8;

        int z=x+++y;

        // int z=x++++y; // This line is commented out because it will cause a compilation error
        System.out.println(z);

        byte p1 = 2;
        p1+=3;
        // p1=p1+4; // error because p1 + 4 results in an int, which cannot be assigned to a byte without casting

        System.out.println(p1);
    }
}