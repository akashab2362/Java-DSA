// Area Of Equilateral Triangle
import java.util.Scanner;
import java.util.InputMismatchException;
public class Assgn7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter length of a equilateral traingle: ");
            int a = sc.nextInt();
            double area = Math.sqrt(3) / 4 * a * a;
            System.out.println(area);
        }catch(InputMismatchException e)
        {
            System.out.println("Enter a valid length!");
        }
        finally{
            sc.close();
        }
    }
}
