package JavaBasics;

import java.util.Scanner;

public class PracticeQ7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = input.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
