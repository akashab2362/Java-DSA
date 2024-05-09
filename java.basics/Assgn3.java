
// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class Assgn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Principal amount: ");
        int p = sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        float r = sc.nextFloat();
        System.out.println("Enter years: ");
        float t = sc.nextFloat();
        double simpleInterest = p * r * t / 100;
        System.out.println("Simple Interest = " + simpleInterest);
        sc.close();
    }
}
