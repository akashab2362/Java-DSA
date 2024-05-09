
// To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter n: ");
            int n = sc.nextInt();
            int n1 = 0, n2 = 1;
            System.out.print(n1 + " " + n2 + " ");
            for (int i = 0; i < n - 2; i++) {
                int n3 = n1 + n2;
                System.out.print(n3 + " ");
                n1 = n2;
                n2 = n3;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please Enter a valid number!");
        } finally {
            sc.close();
        }
    }
}
