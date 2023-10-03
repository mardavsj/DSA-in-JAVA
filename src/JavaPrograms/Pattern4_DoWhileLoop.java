package JavaPrograms;

public class Pattern4_DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;

        do {
            int j = 1;

            do {
                System.out.print("* ");
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i <= 6);
    }
}
