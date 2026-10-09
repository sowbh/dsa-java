import java.util.*;

public class area_and_perimeter_of_rectangle {
    public static void main(String[] args) {
        
        // use Scanner to take input
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int width = sc.nextInt();

        int area = length * width;

        int perimeter = 2 * (length + width);

        System.out.println(area);
        System.out.println(perimeter);

        // return 0;
    
    }
}