// Calculate Average Of N Numbers
import java.util.Scanner;
public class Assgn29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements to be entered: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter number " + (i + 1));
            sum += sc.nextInt();
        }
        System.out.println("Average = " + (sum / n));
        sc.close();
    }
}
