package JavaPrograms;

public class Pattern8_WhileLoop {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 6) {
            int j = 1;
            char ch = 'A';

            while (j <= i) {
                System.out.print(ch + " ");
                ch++;
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
