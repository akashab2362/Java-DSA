// Calculate Discount Of Product

import java.util.Scanner;

public class Assgn30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter discount %");
        float discount = sc.nextFloat();
        System.out.println("Enter amount");
        int amount = sc.nextInt();
        System.out.println("Amount after discount = " + (amount * discount / 100));
        sc.close();
    }
}
