package JavaPrograms;

public class Pattern5_WhileLoop {
    public static void main(String[] args) {

        int i = 1, k = 1;
        while (i <= 6) {
            int j = 1;

            while (j <= i) {
                System.out.print(k + " ");
                k++;
                j++;
            }

            System.out.println();
            i++;
        }
    }
}

