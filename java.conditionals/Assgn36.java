// Calculate CGPA Java Program

import java.util.Scanner;

public class Assgn36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total grades in all subjects");
        float totalGrades = sc.nextFloat();
        System.out.println("Enter no. of subjects: ");
        int subjects = sc.nextInt();
        System.out.println("CGPA = " + (totalGrades/subjects));
        sc.close();
    }
}
