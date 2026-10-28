import java.util.*;
import java.lang.*;

class Solution {
    public int[] printNumbers(int n) {
        // Write your code here and retunr array
        int arr[] = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }
        return arr;

    }
}

public class print_natural_numbers_from_1_to_n {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Solution obj = new Solution();
        int arr[] = obj.printNumbers(n);

        // System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}