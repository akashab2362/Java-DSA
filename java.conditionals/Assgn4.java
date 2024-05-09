// Area Of Isosceles Triangle
import java.util.Scanner;
import java.util.InputMismatchException;
public class Assgn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter height of a triangle: ");
            int h = sc.nextInt();
            System.out.println("Enter base of triangle: ");
            int b = sc.nextInt();
            double a = 1.0 / 2 * b * h;
            System.out.println(a);
        }catch(InputMismatchException e)
        {
            System.out.println("Enter a valid length!");
        }
        finally{
            sc.close();
        }
    }
}
