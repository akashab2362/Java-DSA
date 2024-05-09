
// Perimeter Of Parallelogram
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter side: ");
            int a = sc.nextInt();
            System.out.println("Enter base: ");
            int b = sc.nextInt();
            int p = 2 * (a + b);
            System.out.println("Perimeter of Parallelogram is " + p);
        } catch (InputMismatchException e) {
            System.out.println("Please Enter a valid value for length");
        } finally {
            sc.close();
        }
    }
}