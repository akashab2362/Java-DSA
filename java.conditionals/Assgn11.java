
// Perimeter Of Rectangle
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter length: ");
            int l = sc.nextInt();
            System.out.println("Enter breadth: ");
            int b = sc.nextInt();
            int p = 2 * (l + b);
            System.out.println("Perimeter of Rectangle is " + p);
        } catch (InputMismatchException e) {
            System.out.println("Please Enter a valid value for length");
        } finally {
            sc.close();
        }
    }
}