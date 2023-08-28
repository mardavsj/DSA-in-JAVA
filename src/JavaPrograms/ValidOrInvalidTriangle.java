// WAP to check whether a triangle is valid or not, when the three angles of the triangle are entered through the keyboard.

package JavaPrograms;
import java.util.Scanner;
public class ValidOrInvalidTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the angles for triangle: ");

        float angle1 = input.nextFloat();
        float angle2 = input.nextFloat();
        float angle3 = input.nextFloat();

        if (angle1 + angle2 + angle3 == 180){
            System.out.println("The triangle is valid");
        }
        else {
            System.out.println("The triangle is not valid");
        }
    }
}
