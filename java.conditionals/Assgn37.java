// Compound Interest Java Program

import java.util.Scanner;

public class Assgn37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        int principalAmount = sc.nextInt();
        System.out.println("Enter time in years");
        float years = sc.nextFloat();
        System.out.println("Enter rate of interest: ");
        float r = sc.nextFloat();
        float compoundInterest = principalAmount * (float) Math.pow((1 + r / 100), years);
        System.out.println("Compound Interest = " + compoundInterest);
        sc.close();
    }
}
