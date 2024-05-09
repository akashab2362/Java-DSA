// Power In Java

import java.util.Scanner;

public class Assgn33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter a power: ");
        int power = sc.nextInt();
        System.out.println(n + "^" + power + " = " + Math.pow(n, power));
        sc.close();
    }
}
