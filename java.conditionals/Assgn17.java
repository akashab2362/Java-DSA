
// Volume Of Sphere Java Program
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter radius of sphere: ");
            int r = sc.nextInt();
            double v = 4.0 / 3 * Math.PI * r * r * r;
            System.out.println("Volume of sphere is " + v);
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid value!");
        } finally {
            sc.close();
        }
    }
}
