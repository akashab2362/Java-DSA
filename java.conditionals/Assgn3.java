// Area Of Rectangle
import java.util.Scanner;
import java.util.InputMismatchException;
public class Assgn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter length of a rectangle: ");
            int l = sc.nextInt();
            System.out.println("Enter breadth of rectangle: ");
            int b = sc.nextInt();
            int a = l * b;
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
