// HCF Of Two Numbers Program

import java.util.Scanner;

public class Assgn45 {
    public static int findGcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a == b) {
            return a;
        }
        if (a < b) {
            return findGcd(a, b - a);
        }
        return findGcd(a - b, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int n2 = sc.nextInt();
        int gcd = findGcd(n1, n2);
        System.out.println("GCD / HCF of " + n1 + " and " + n2 + " is " + gcd);
        sc.close();
    }
}
