// WAP to do arithmetic operation (+, -, *, / ) after reading two numbers.

package JavaPrograms;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two numbers for the operations: ");

        int a,b,c,d,e,f;
        a = input.nextInt();
        b = input.nextInt();
        c = a+b;
        d = a-b;
        e = a*b;
        f = a/b;

        System.out.println("Addition: "+c);
        System.out.println("Subtraction: "+d);
        System.out.println("Multiplication: "+e);
        System.out.println("Division: "+f);
    }
}
