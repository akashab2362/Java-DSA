// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;
public class Assgn24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        while(n != 0)
        {
            sum += n;
            System.out.println("Enter n: ");
            n = sc.nextInt();
        }
        System.out.println("The sum of all numbers is " + sum);
        sc.close();
    }
}
