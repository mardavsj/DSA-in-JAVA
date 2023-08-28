// .A company insures its drivers in the following cases: 
// − If the driver is married. 
// − If the driver is unmarried, male & above 30 years of age. 
// − If the driver is unmarried, female & above 25 years of age. 
// In all other cases the driver is not insured. If the marital status, sex and age of the driver are the inputs, write a program to determine whether the driver is to be insured or not. 

package JavaPrograms;
import java.util.Scanner;

public class DriverInsurance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("married/unmarried: ");
        String status = input.nextLine();

        System.out.println("male/female: ");
        String gender = input.nextLine();

        System.out.println("Enter age: ");
        int age = input.nextInt();

        if (status == "married") {
            System.out.println("The driver is insure.");
        } else if (status == "unmarried" && gender == "male" && age>30) {
            System.out.println("The driver is insure.");
        }
        else if (status == "unmarried" && gender == "female" && age>25) {
            System.out.println("The driver is insure.");
        }
        else {
            System.out.println("The driver is not insure.");
        }
    }
}
