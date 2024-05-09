
// Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class Assgn25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int max = n;
        while (n != 0) {
            System.out.println("Enter n: ");
            n = sc.nextInt();
            if (n > max) {
                max = n;
            }
        }
        System.out.println("The largest of all numbers is " + max);
        sc.close();
    }
}
