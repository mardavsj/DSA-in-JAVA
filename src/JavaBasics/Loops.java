package JavaBasics;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Print odd numbers from 1 to 10.
        for (int num = 1; num<=10; num+=2) {
            System.out.println(num);
        }
        // Print numbers based on user input.
        Scanner input = new Scanner (System.in);
        System.out.print("Enter numbers to be shown: ");
        int n = input.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print(i+ " ");
            System.out.print("Hello World!  ");
        }
    }
}