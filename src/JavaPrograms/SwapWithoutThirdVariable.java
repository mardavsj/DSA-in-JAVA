// WAP to swap the values of two numbers without third variable.

package JavaPrograms;
import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("After swapping:");
        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);
    }
}
