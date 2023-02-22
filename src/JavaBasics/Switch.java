package JavaBasics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String fruit = input.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits!");
            case "apple" -> System.out.println("Inventor of gravity!");
            case "orange" -> System.out.println("Veins filled with Vitamin C");
            default -> System.out.println("Please enter either mango or apple, or you can choose orange as well.");
        }

        int day = input.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday!");
            case 2 -> System.out.println("Tuesday!");
            case 3 -> System.out.println("Wednesday!");
            case 4 -> System.out.println("Thursday!");
            case 5 -> System.out.println("Friday!");
            case 6 -> System.out.println("Saturday!");
            case 7 -> System.out.println("Sunday!");
        }
    }
}
