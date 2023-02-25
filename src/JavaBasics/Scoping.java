package JavaBasics;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        String name = "Mardav";

        // Block Scoping
        {
            a = 94;
            System.out.println(a); // Original value will get changed.

            int c = 69;
            name="Mardav";
            System.out.println(name);
        }
        int c = 79;
        System.out.println(a); // new value will be printed!
        System.out.println(name);


        // For loop scoping
        for (int i =0; i<4; i++){
            System.out.println(i);
            a = 10000;
        }
        System.out.println(a);
    }

    static void random(int marks){
        int num = 94;
        System.out.println(num);
        System.out.println(marks);
    }
}
