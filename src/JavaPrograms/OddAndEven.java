// Any integer is input through the keyboard. Write a program to find out whether it is an odd number or even number.

package JavaPrograms;
import java.util.Scanner;
public class OddAndEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println(num+" is an even number");
        }
        else {
            System.out.println(num+" is an odd number");
        }
    }
}
