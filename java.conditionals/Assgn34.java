// Calculate Depreciation of Value

import java.util.Scanner;

public class Assgn34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial value: ");
        int iv = sc.nextInt();
        System.out.println("Enter rate of depreciation: ");
        float r = sc.nextFloat();
        System.out.println("Enter time in years: ");
        float t = sc.nextFloat();
        double depreciation = iv * Math.pow((1 - r / 100), t);
        System.out.println("Depreciation = " + depreciation);
        sc.close();
    }
}
