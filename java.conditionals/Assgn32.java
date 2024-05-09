// Calculate Commission Percentage

import java.util.Scanner;

public class Assgn32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total sales revenue: ");
        int sales = sc.nextInt();
        System.out.println("Enter commission rate: ");
        float commissionRate = sc.nextFloat();
        float commission = sales * commissionRate / 100;
        System.out.println("Commission = " + commission);
        sc.close();
    }
}
