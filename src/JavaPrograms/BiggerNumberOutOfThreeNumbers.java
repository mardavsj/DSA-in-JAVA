// WAP to print the big number out of three numbers.

package JavaPrograms;

public class BiggerNumberOutOfThreeNumbers {
    public static void main(String[] args) {
        int a,b,c;
        a = 10;
        b = 12;
        c = 2;

        if(a>b && a>c){
            System.out.println(a+"is bigger than "+b+" and "+c);
        }
        else if (b>a && b>c) {
            System.out.println(b+" is bigger than "+a+" and "+c);
        }
        else {
            System.out.println(c+" is bigger than "+a+" and "+b);
        }
    }
}
