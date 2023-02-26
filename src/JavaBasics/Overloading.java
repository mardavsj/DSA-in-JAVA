package JavaBasics;

public class Overloading {
    public static void main(String[] args) {
        fun (94);
        fun ("Mardav");
    }

    static void fun (int a) {
        System.out.println(a);
    }

    static void fun (String name) {
        System.out.print(name);
    }
}
