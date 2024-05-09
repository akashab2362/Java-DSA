// Area Of Rhombus
import java.util.Scanner;
import java.util.InputMismatchException;
public class Assgn6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter height of a rhombus: ");
            int h = sc.nextInt();
            System.out.println("Enter base of rhombus: ");
            int b = sc.nextInt();
            int a = b * h;
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
