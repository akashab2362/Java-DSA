
// Total Surface Area Of Cube
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter side of cube: ");
            int a = sc.nextInt();
            double area = 6.0 * a * a;
            System.out.println("Total Surface Area Of Cube is " + area);
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid value!");
        } finally {
            sc.close();
        }
    }
}
