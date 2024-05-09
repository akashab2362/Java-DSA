
// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            double n1 = sc.nextDouble();
            System.out.println("Enter second number: ");
            double n2 = sc.nextDouble();
            System.out.println("n1 + n2 = " + (n1 + n2));
            System.out.println("n1 - n2 = " + (n1 - n2));
            System.out.println("n1 * n2 = " + (n1 * n2));
            System.out.println("n1 / n2 = " + (n1 / n2));
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid number only!");
        } finally {
            sc.close();
        }
    }
}
