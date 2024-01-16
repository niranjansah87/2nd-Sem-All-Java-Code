package p3;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
	    System.out.print("Enter the number  = ");
	    int n = sc.nextInt();
	    int i,c=0;
	    for(i=1;i*i<n;i++)
	    {
	    	if(n%i == 0)
	    	{
	    		c+=i;
	    	}
	    }
	    if(c==n)
    	{
    		System.out.println("Perfect number");
    	}
    	else
    	{
    		System.out.println("Not a Perfect number ");
    	}
	}

}