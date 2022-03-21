import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String args[]) throws Exception
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers to add:");
        a=sc.nextInt();
        b=sc.nextInt();


        try
        {
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException is: " +e);
        }
        finally
        {
            System.out.println("Thankyou");
        }
    }
}
