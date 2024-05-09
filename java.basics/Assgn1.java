// Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
import java.util.InputMismatchException;
public class Assgn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a integer: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is a even number.");
            } else {
                System.out.println(num + " is a odd number.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please Enter a valid integer only!");
        } finally {
            sc.close();
        }
    }
}