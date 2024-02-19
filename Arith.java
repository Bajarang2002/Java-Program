import java.util.Scanner;

public class Arith {
    public static void main(String [] args)
    {
         int a,b,c,d,e,f;
         Scanner ar =new Scanner(System.in);
         System.out.println("Enter the value of a : ");
         a =ar.nextInt();
         System.out.println("Enter the value of b :");
         b =ar.nextInt();
         c=a+b;
         d=a-b;
         e=a*b;
         f=a/b;
         System.out.println("Addition is:"+c);
         System.out.println("Substraction is:"+d);
         System.out.println("Multiplication  is:"+e);
         System.out.println("Division is:"+f);
 
    }
    
}
