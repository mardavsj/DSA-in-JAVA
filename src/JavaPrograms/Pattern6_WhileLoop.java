package JavaPrograms;

public class Pattern6_WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 6) {
            int j = 1;

            int spaces = 6 - i;
            while (spaces > 0) {
                System.out.print("   ");
                spaces--;
            }

            int k = 1;
            while (j <= i) {
                System.out.print(k + "  ");
                k++;
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
