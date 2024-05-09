// Java Program Vowel Or Consonant

import java.util.Scanner;

public class Assgn47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "aeiouAEIOU";
        char ch = sc.next().charAt(0);
        if(str.indexOf(ch) != -1)
        {
            System.out.println("It is a vowel");
        }
        else{
            System.out.println("It is a consonant");
        }
        sc.close();
    }
}
