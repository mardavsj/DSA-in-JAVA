package JavaBasics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

        int num1 = (int)(67.50f);
        System.out.print(num1);

        byte a =40;
        byte b =50;
        byte c =100;
        int d =a*b/c;
        System.out.println(d);

        int number = 'A';
        System.out.println(number);
        System.out.println("Namaskaram!");

        byte by = 42;
        char ch = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.654f;
        double db = 0.1234;
        double result = (f * by) + (f / ch) - (db - s + i);
        System.out.println((f * by) + "" + (f / ch) + "" + (db - s));
        System.out.print(result);
    }
}
