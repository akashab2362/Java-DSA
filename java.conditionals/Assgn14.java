
// Volume Of Cone Java Program
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter radius: ");
            int r = sc.nextInt();
            System.out.println("Enter height: ");
            int h = sc.nextInt();
            double a = 1.0 / 3 * Math.PI * r * r * h;
            System.out.println("Volume of cone is " + a);
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid value!");
        } finally {
            sc.close();
        }
    }
}
