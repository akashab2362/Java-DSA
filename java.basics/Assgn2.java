// Take name as input and print a greeting message for that particular name.
import java.util.Scanner;
public class Assgn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello " + name);
        sc.close();
    }
}
