package p1;
import java.util.Scanner;
public class UserInput {
	
    public static void main(String args[])
    {
    	int a;
        double b;
        String str;
        Scanner q=new Scanner(System.in);
        System.out.println("Enter age ");
         a=q.nextInt();
         System.out.println("Enter Weight ");
         b=q.nextDouble();
         System.out.println("Enter name ");
        str=q.next();
        System.out.println("Age is "+a+" Weight is "+b+" Name is"+str);
    }
    
}
