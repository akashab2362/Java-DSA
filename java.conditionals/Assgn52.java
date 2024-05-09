// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class Assgn52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int sumOfNegativeNumbers = 0, sumOfPositiveEvenNumbers = 0, sumOfPositiveOddNumbers = 0;
        while (n != 0) {
            if (n < 0) {
                sumOfNegativeNumbers += n;
            } else {
                if (n % 2 == 0) {
                    sumOfPositiveEvenNumbers += n;
                } else {
                    sumOfPositiveOddNumbers += n;
                }
            }
            System.out.println("Enter n: ");
            n = sc.nextInt();
        }
        System.out.println("Sum of negative number = " + sumOfNegativeNumbers);
        System.out.println("Sum of positive even number = " + sumOfPositiveEvenNumbers);
        System.out.println("Sum of positive odd number = " + sumOfPositiveOddNumbers);
        sc.close();
    }
}
