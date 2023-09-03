package JavaPrograms;

public class Pattern9_WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        
        while (i <= 6) {
            int j = 1;
            int space = 6 - i;
            
            while (space > 0) {
                System.out.print("   ");
                space--;
            }
            
            int k = 1;
            while (j <= i) {
                System.out.print(k + "  ");
                k++;
                j++;
            }
            
            k -= 2;
            j = 1;
            while (j < i) {
                System.out.print(k + "  ");
                k--;
                j++;
            }

            System.out.println();
            i++;
        }
        
        i = 6 - 1;
        while (i >= 1) {
            int j = 1;
            int space = 6 - i;
            
            while (space > 0) {
                System.out.print("   ");
                space--;
            }
            
            int k = 1;
            while (j <= i) {
                System.out.print(k + "  ");
                k++;
                j++;
            }
            
            k -= 2;
            j = 1;
            while (j < i) {
                System.out.print(k + "  ");
                k--;
                j++;
            }

            System.out.println();
            i--;
        }
    }
}
