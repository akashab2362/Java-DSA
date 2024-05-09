
// Input currency in rupees and output in USD.
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter amount in rupees: ");
            int amountInRupees = sc.nextInt();
            double amountInUSD = amountInRupees * 0.012;
            System.out.println("Rs." + amountInRupees + " = " + "$" + amountInUSD);
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid amount!");
        } finally {
            sc.close();
        }
    }
}
