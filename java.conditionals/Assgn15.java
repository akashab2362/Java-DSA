
// Volume Of Prism Java Program
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter base of prism: ");
            int b = sc.nextInt();
            System.out.println("Enter height of prism: ");
            int h = sc.nextInt();
            double v = b * h;
            System.out.println("Volume of prism is " + v);
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid value!");
        } finally {
            sc.close();
        }
    }
}
