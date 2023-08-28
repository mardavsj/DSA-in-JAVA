// WAP to input day no at command line and print day name using switch statement.

package JavaPrograms;
import java.util.Scanner;

public class PrintDayNameUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day no between 1-7: ");

        int DayNumber = input.nextInt();
        String DayName;

        switch (DayNumber){
            case 1:
                DayName = "Monday";
                break;
            case 2:
                DayName = "Tuesday";
                break;
            case 3:
                DayName = "Wednesday";
                break;
            case 4:
                DayName = "Thursday";
                break;
            case 5:
                DayName = "Friday";
                break;
            case 6:
                DayName = "Saturday";
                break;
            case 7:
                DayName = "Sunday";
                break;
            default:
                DayName = "DayNumber is Invalid";
        }
        System.out.println("DayName: "+DayName);
    }
}
