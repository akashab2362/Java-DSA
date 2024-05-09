// Factorial Program In Java
import java.util.Scanner;
public class Assgn27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        long fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        System.out.println(fact);
        sc.close();
    }
}
