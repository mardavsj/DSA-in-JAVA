// WAP to input day no at command line and print day name using if statement.

package JavaPrograms;
import java.util.Scanner;
public class PrintDayNameUsingIfElse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day no between 1-7: ");

        int DayNumber = input.nextInt();

        if (DayNumber == 1){
            System.out.println("Monday");
        }
        else if (DayNumber == 2){
            System.out.println("Tuesday");
        }
        else if (DayNumber == 3){
            System.out.println("Wednesday");
        }
        else if (DayNumber == 4){
            System.out.println("Thursday");
        }
        else if (DayNumber == 5){
            System.out.println("Friday");
        }
        else if (DayNumber == 6){
            System.out.println("Saturday");
        }
        else if (DayNumber == 7){
            System.out.println("Sunday");
        }
    }
}
