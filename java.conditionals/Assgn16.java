
// Volume Of Cylinder Java Program
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter radius of cylinder: ");
            int r = sc.nextInt();
            System.out.println("Enter height of cylinder: ");
            int h = sc.nextInt();
            double v = Math.PI * r * r * h;
            System.out.println("Volume of cylinder is " + v);
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid value!");
        } finally {
            sc.close();
        }
    }
}
