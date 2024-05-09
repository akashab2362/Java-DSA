// Reverse A String In Java

import java.util.Scanner;

public class Assgn42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String revStr = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            revStr += str.charAt(i);
        }
        System.out.println(revStr);
        sc.close();
    }
}
