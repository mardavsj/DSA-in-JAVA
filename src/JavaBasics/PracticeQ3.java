package JavaBasics;

public class PracticeQ3 {
    public static void main(String[] args) {
        // int, double, float
        int a, b;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : a, b = "+a+", "+ + b);
    }
}
