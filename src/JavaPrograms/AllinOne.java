package JavaPrograms;
import java.util.Scanner;

public class AllinOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Factorial of a number");
            System.out.println("2. Check if a number is prime");
            System.out.println("3. Check if a number is odd or even");
            System.out.println("4. Check if a number is palindrome");
            System.out.println("5. Check if a number is Armstrong");
            System.out.println("6. Check if a number is magic");
            System.out.println("7. Exit");
            System.out.print("Enter your choice(1-7):");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    factorial();
                    break;
                case 2:
                    primeCheck();
                    break;
                case 3:
                    oddEvenCheck();
                    break;
                case 4:
                    palindromeCheck();
                    break;
                case 5:
                    armstrongCheck();
                    break;
                case 6:
                    magicCheck();
                    break;
                case 7:
                    System.out.println("Exiting.....\nExited");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 7);
        input.close();
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number for its factorial: ");
        int num = input.nextInt();
        long factorial = 1;
        for(int i=1; i<=num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of"+num+" is "+factorial);
    }

    static void primeCheck() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not: ");
        int num2 = input.nextInt();
        boolean Prime = num2>1;
        for (int i = 2; i * i <= num2 && Prime; i++) {
            if (num2 % i == 0) {
                Prime = false;
                break;
            }
        }
        if (Prime) {
            System.out.println(num2 + " is a prime number.");
        } else {
            System.out.println(num2 + " is not a prime number.");
        }
    }

    static void oddEvenCheck() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to check whether it is odd or even: ");
        int num3 = input.nextInt();
        if (num3 % 2 == 0) {
            System.out.println(num3+" is an even number");
        }
        else {
            System.out.println(num3+" is an odd number");
        }
    }

    static void palindromeCheck() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to check whether it is palindrome or not: ");
        int num4 = input.nextInt();
        int a ,sum=0, temp=num4;
        do {
           a = num4 % 10;
           sum = (sum*10)+a;
           num4 = num4/10;
        }while(num4>0);
        if(temp == sum){
            System.out.println("It is a palindrome number.");
        }
        else {
            System.out.println("It is not a palindrome number");
        }
    }

    static void armstrongCheck() {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter any number to check whether it is armstrong or not: ");
        int num5 = input.nextInt();
        int sum=0, b, last=num5;
        while (num5>0) {
            b = num5 % 10;
            sum = sum + b*b*b;
            num5 = num5/10;
        }
        if (last == sum){
            System.out.println(num5+" is an Armstrong number");
        }
        else {
            System.out.println(num5+" is not an Armstrong number");
        }
    }

    static void magicCheck() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to check whether the number is magic one or not: ");
        int num6 = input.nextInt();
        if (num6 % 9 == 1) {
            System.out.println(num6+" is a Magic number");
        }
        else {
            System.out.println(num6+" is not a Magic number");
        }
    }
}
