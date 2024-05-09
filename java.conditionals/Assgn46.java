// LCM Of Two Numbers

import java.util.Scanner;

public class Assgn46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int n2 = sc.nextInt();
        int ans = (n1 > n2) ? n1 : n2;
        while (true) {
            if (ans % n1 == 0 && ans % n2 == 0) {
                System.out.println("LCM of " + n1 + " and " + n2 + " is " + ans);
                break;
            }
            ans++;
        }
        sc.close();
    }
}
