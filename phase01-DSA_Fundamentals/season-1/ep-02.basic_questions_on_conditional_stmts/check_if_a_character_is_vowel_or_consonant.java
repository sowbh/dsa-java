import java.util.*;
import java.lang.*;

public class check_if_a_character_is_vowel_or_consonant {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = checkCharacter(ch);
        IO.println(result);
    }

    public String checkCharacter(char ch) {

        //write your code here
        char lower = Character.toLowerCase(ch);

        if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
            return "Vowel";
        } else if (lower > 'a' && lower <= 'z') {
            return "Consonant";
        } 
        return "Invalid input";
    }
}
        