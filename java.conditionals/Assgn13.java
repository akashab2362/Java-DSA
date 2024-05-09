// Perimeter Of Rhombus
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter side: ");
            int a = sc.nextInt();
            int p = 4 * a;
            System.out.println("Perimeter of Rhombus is " + p);
        } catch (InputMismatchException e) {
            System.out.println("Please Enter a valid value for length");
        } finally {
            sc.close();
        }
    }
}