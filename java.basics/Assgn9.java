import java.util.Scanner;
import java.util.InputMismatchException;

public class Assgn9 {
    public static int calculateDigits(int i) {
        String str = Integer.toString(i);
        return str.length();
    }

    public static boolean checkIfArmstrongNumber(int i) {
        int originalNum = i;
        int n = calculateDigits(i);
        int sum = 0;
        while (i > 0) {
            int rem = i % 10;
            sum += Math.pow(rem, n);
            i /= 10;
        }
        return originalNum == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a starting number: ");
            int start = sc.nextInt();
            System.out.println("Enter a ending number");
            int end = sc.nextInt();
            System.out.println("Armstrong Numbers between " + start + " and " + end + " are ");
            for (int i = start; i <= end; i++) {
                if (checkIfArmstrongNumber(i)) {
                    System.out.print(i + " ");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid number!");
        } finally {
            sc.close();
        }
    }
}
