
// Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;

public class Assgn22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = 1, sum = 0;
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        while (num > 0) {
            int rem = num % 10;
            product *= rem;
            sum += rem;
            num /= 10;
        }
        System.out.println("Product = " + product);
        System.out.println("Sum = " + sum);
        System.out.println("Difference between product and sum of digits of the number is " + (product - sum));
        sc.close();
    }
}
