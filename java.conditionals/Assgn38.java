// Calculate Average Marks

import java.util.Scanner;

public class Assgn38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks: ");
        int totalMarks = sc.nextInt();
        System.out.println("Enter no. of subjects: ");
        int noOfSubjects = sc.nextInt();
        System.out.println("Average = " + (totalMarks / noOfSubjects));
        sc.close();
    }
}
