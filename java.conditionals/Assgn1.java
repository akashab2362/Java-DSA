// Area Of Circle Java Program
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter radius: ");
            float r = sc.nextFloat();
            double area = Math.PI * r * r;
            System.out.println("Area of circle is " + area);
        } catch (InputMismatchException e) {
            System.out.println("Please Enter a valid value for radius");
        } finally {
            sc.close();
        }
    }
}