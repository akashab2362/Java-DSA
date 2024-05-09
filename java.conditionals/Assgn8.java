// Perimeter Of Circle Java Program
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter radius: ");
            float r = sc.nextFloat();
            double p = 2 * Math.PI * r;
            System.out.println("Perimeter of circle is " + p);
        } catch (InputMismatchException e) {
            System.out.println("Please Enter a valid value for radius");
        } finally {
            sc.close();
        }
    }
}