package JavaBasics;

// Reverse a string
import java.util.Scanner;

public class PracticeQ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = input.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}
