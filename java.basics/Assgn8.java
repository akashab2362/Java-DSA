
// To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class Assgn8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        if (revStr.equals(str)) {
            System.out.println("The String is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
        sc.close();
    }
}
