package JavaBasics;

import java.util.Arrays;

public class VariableArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8,15428);
        Multi(1,3,"Mardav", "is", "not", "working");
    }

    static void Multi(int a, int b, String ...c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(c));
    }

    static void fun(int...n) {
        System.out.println(Arrays.toString(n));
    }
}
