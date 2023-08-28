// WAP to swap the values of two numbers with the third variable.

package JavaPrograms;
import java.util.Scanner;

public class SwapWithThirdVariable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        int extra = num1;
        num1 = num2;
        num2 = extra;

        System.out.println("After swapping: ");
        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);
    }
}
