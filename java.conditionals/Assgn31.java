// Calculate Distance Between Two Points

import java.util.Scanner;

public class Assgn31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter y2: ");
        int y2 = sc.nextInt();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Distance from (%d, %d) to (%d, %d) = %f", x1, x2, y1, y2, distance);
        sc.close();
    }
}
