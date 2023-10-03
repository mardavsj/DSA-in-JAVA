package JavaPrograms;

public class Pattern7_DoWhileLoop {
    public static void main(String[] args) {
        int spaces = 6 - 1;

        int i = 1;
        do {
            int space = 1;
            while (space <= spaces) {
                System.out.print("    ");
                space++;
            }

            int k = 1;
            while (k <= i) {
                System.out.print(k + "   ");
                k++;
            }

            k = i - 1;
            while (k >= 1) {
                System.out.print(k + "   ");
                k--;
            }
            System.out.println();
            spaces--;
            i++;
        } while (i <= 6);
    }
}
