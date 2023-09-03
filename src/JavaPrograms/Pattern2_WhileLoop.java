package JavaPrograms;

public class Pattern2_WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 6) {
            int j = 1;
            while (j <= i) {
                System.out.print("1 ");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
