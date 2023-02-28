package JavaBasics;

import java.util.Scanner;

public class PracticeQ1 {

    // Prime and not prime numbers.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n){
        if (n<=1) {
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}