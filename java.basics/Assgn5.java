
// Take 2 numbers as input and print the largest number.
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number 1: ");
            double n1 = sc.nextDouble();
            System.out.println("Enter number 2: ");
            double n2 = sc.nextDouble();
            if (n1 > n2) {
                System.out.println(n1 + " is largest");
            } else {
                System.out.println(n2 + " is largest");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please Enter a valid numbers only!");
        } finally {
            sc.close();
        }
    }
}
