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
    }
}
