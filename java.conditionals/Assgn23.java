// Input a number and print all the factors of that number (use loops).
import java.util.Scanner;
public class Assgn23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The factors of the number are: ");
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
