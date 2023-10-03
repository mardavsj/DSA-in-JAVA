package JavaPrograms;

public class Pattern9_DoWhileLoop {
    public static void main(String[] args) {
        int n = 6; // Number of rows
        int i = 1; // Initialize row counter

        // Loop for the top half of the pattern
        do {
            int j = 1; // Initialize column counter
            int spaces = n - i;

            // Print leading spaces
            do {
                System.out.print("   "); // Three spaces for formatting
                spaces--;
            } while (spaces > 0);

            // Print increasing numbers
            int num = 1;
            do {
                System.out.print(num + "  ");
                num++;
                j++;
            } while (j <= i);

            // Print a new line after each row
            System.out.println();

            i++;
        } while (i <= n);

        // Loop for the bottom half of the pattern
        i = n - 1;
        do {
            int j = 1; // Initialize column counter
            int spaces = n - i;

            // Print leading spaces
            do {
                System.out.print("   "); // Three spaces for formatting
                spaces--;
            } while (spaces > 0);

            // Print increasing numbers
            int num = 1;
            do {
                System.out.print(num + "  ");
                num++;
                j++;
            } while (j < i);

            // Print a new line after each row
            System.out.println();

            i--;
        } while (i >= 1);
    }
}
