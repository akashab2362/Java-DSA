// Sum Of N Numbers

import java.util.Scanner;

public class Assgn39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter number " + (i + 1));
            sum += sc.nextInt();
        }
        System.out.println("The sum of n numbers is " + sum);
        sc.close();
    }
}
