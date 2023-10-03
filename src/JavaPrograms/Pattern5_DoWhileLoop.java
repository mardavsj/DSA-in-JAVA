package JavaPrograms;

public class Pattern5_DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        int k = 1;

        do {
            int j = 1;

            do {
                System.out.print(k + " ");
                k++;
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i <= 6);
    }
}
