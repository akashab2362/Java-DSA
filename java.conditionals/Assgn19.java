
// Curved Surface Area of cylinder Java Program
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter radius of cylinder: ");
            int r = sc.nextInt();
            System.out.println("Enter height of cylinder: ");
            int h = sc.nextInt();
            double a = 2 * Math.PI * r * h;
            System.out.println("Curved Surface Area of cylinder is " + a);
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid value!");
        } finally {
            sc.close();
        }
    }
}
