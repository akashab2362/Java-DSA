// Calculate Batting Average

import java.util.Scanner;

public class Assgn35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of runs scored: ");
        int runs = sc.nextInt();
        System.out.println("Enter number of wickets: ");
        int wickets = sc.nextInt();
        float battingAverage = (float)runs/ wickets;
        System.out.println(battingAverage);
        sc.close();
    }
}
