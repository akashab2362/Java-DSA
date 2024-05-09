
// Calculate Electricity Bill
/*
    1 to 100 units – Rs. 10/unit
    100 to 200 units – Rs. 15/unit
    200 to 300 units – Rs. 20/unit
    above 300 units – Rs. 25/unit
 */
import java.util.Scanner;

public class Assgn28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units used: ");
        int unit = sc.nextInt();
        int totalPrice = 0;
        if (unit <= 100) {
            totalPrice = unit * 10;
        } else if (unit <= 200) {
            totalPrice = (100 * 10) + (unit - 100) * 15;
        } else if (unit <= 300) {
            totalPrice = (100 * 10) + (100 * 15) + (unit - 200) * 20;
        } else {
            totalPrice = (100 * 10) + (100 * 15) + (100 * 20) + (unit - 300) * 25;
        }
        System.out.println("Electricity Bill = " + totalPrice);
        sc.close();
    }
}
