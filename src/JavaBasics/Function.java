package JavaBasics;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        int ans = sums();
        System.out.println(ans);
        sum();
    }

    static int sums () {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num3 = input.nextInt();
        System.out.print("Enter the second number:");
        int num4 = input.nextInt();
        int sums = num3+num4;
        return sums;
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = input.nextInt();
        System.out.print("Enter the second number:");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("The sum will be "+ sum);
    }
}
