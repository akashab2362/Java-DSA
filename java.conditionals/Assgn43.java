// Find if a number is palindrome or not
import java.util.Scanner;

public class Assgn43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int num = n;
        int revNum = 0;
        while(num > 0)
        {
            revNum = revNum * 10 + (num % 10);
            num/=10;
        }
        if(revNum == n)
        {
            System.out.println("The number is a palidrome");
        }
        else
        {
            System.out.println("The number is not a palindrome");
        }
        sc.close();
    }
}
