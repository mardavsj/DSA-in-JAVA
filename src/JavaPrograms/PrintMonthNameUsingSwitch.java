// WAP to input month no at command line and print month name using switch statement.

package JavaPrograms;
import java.util.Scanner;

public class PrintMonthNameUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month no between 1-7: ");

        int MonthNumber = input.nextInt();
        String MonthName;

        switch (MonthNumber){
            case 1:
                MonthName = "January";
                break;
            case 2:
                MonthName = "February";
                break;
            case 3:
                MonthName = "March";
                break;
            case 4:
                MonthName = "April";
                break;
            case 5:
                MonthName = "May";
                break;
            case 6:
                MonthName = "June";
                break;
            case 7:
                MonthName = "July";
                break;
            case 8:
                MonthName = "August";
                break;
            case 9:
                MonthName = "September";
                break;
            case 10:
                MonthName = "October";
                break;
            case 11:
                MonthName = "November";
                break;
            case 12:
                MonthName = "December";
                break;
            default:
                MonthName = "MonthNumber is Invalid";
        }
        System.out.println("MonthName: "+MonthName);
    }
}
