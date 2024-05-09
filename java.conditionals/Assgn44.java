// Future Investment Value

import java.util.Scanner;

public class Assgn44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter present Value: ");
        int pv = sc.nextInt();
        System.out.println("Enter interest rate: ");
        float r = sc.nextFloat();
        System.out.println("Enter no. of years: ");
        int n = sc.nextInt();
        double fv = pv * Math.pow(1 + r / 100, n);
        System.out.println(fv);
        sc.close();
    }
}
