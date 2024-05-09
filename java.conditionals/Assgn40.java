// Armstrong Number In Java

import java.util.Scanner;

public class Assgn40 {
    public static int noOfDigits(int num)
    {
        int count = 0;
        while(num > 0)
        {
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Armstrong number or not: ");
        int num = sc.nextInt();
        int d = noOfDigits(num);
        int newNum = num;
        int sum = 0;
        while(newNum > 0)
        {
            sum += Math.pow(newNum%10, d);
            newNum /= 10;
        }
        if(num == sum)
        {
            System.out.println(num + " is a Armstrong number");
        }
        else
        {
            System.out.println(num + " is not a Armstrong number");
        }
        sc.close();
    }
}
