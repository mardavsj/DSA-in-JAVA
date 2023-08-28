// If cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss.
//  Also determine how much profit he made or loss he incurred.

package JavaPrograms;
import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the cost price: ");
        float cost = input.nextFloat();

        System.out.println("Enter the selling price: ");
        float selling = input.nextFloat();

        if (selling > cost) {
            float profit = selling-cost;
            System.out.println("The seller made a profit of "+profit);
        }
        else {
            float loss = cost - selling;
            System.out.println("The seller incurred a loss of "+loss);
        }
    }
}
