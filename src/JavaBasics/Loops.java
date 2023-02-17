package JavaBasics;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Print odd numbers from 1 to 10 using for loop.
        for (int num = 1; num<=10; num+=2) {
            System.out.println(num);
        }

        // Print numbers based on user input using for loop.
        Scanner input = new Scanner (System.in);
        System.out.print("Enter numbers to be shown: ");
        int n = input.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print(i+ " ");
            System.out.println("Hello World!  ");
        }

        // Print odd numbers from 1 to 20 using while loop.
        int number = 1;
        while (number <= 20) {
            System.out.println(number);
            number += 2;
        }

        // Print using do-while loop.
        int a = 2;
        do {
            System.out.println("Same again, Hello World");
        }
        while (a != 1);
    }
}