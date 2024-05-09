
// Volume Of Pyramid Java Program
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter length of pyramid: ");
            int l = sc.nextInt();
            System.out.println("Enter width of pyramid: ");
            int w = sc.nextInt();
            System.out.println("Enter height of pyramid: ");
            int h = sc.nextInt();
            double v = l * w * h / 3.0;
            System.out.println("Volume of pyramid is " + v);
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid value!");
        } finally {
            sc.close();
        }
    }
}
