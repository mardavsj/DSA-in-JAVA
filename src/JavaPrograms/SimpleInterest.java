// WAP to calculate the simple interest where P, R, T are given by user.

package JavaPrograms;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Provide Principal, Rate of Interest and Time: ");

        float principal = input.nextFloat();
        float rate = input.nextFloat();
        float time = input.nextFloat();

        float SimpleInterest = (principal * rate * time ) / 100f;

        System.out.println("Simple Interest: "+SimpleInterest);
    }
}
