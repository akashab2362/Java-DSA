// Find Ncr & Npr

import java.util.Scanner;

public class Assgn41 {
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();
        double nCr = factorial(n) / factorial(r) * factorial(n - r);
        System.out.println("nCr = " + nCr);
        double nPr = factorial(n) / factorial(n - r);
        System.out.println("nPr = " + nPr);
        sc.close();
    }
}
