package JavaPrograms;

public class Pattern8_DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;

        do {
            int j = 1;
            char ch = 'A';

            do {
                System.out.print(ch + " ");
                ch++;
                j++;
            } while (j <= i);

            System.out.println();

            i++;
        } while (i <= 6);
    }
}
