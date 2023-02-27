package JavaBasics;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary for addition of bonus: ");
        int salary = input.nextInt();
        if (salary >= 100000) {
            salary = salary + 10000;
        }
        else if (salary >= 50000) {
            salary += 6000;
        }
        else {
            salary += 3000;
        }
        System.out.println(salary);
    }
}