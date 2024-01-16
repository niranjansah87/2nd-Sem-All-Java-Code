import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n,m,temp,sum=0;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the number=");
		n=a.nextInt();
		temp=n;
		while(n>0)
		{
		m=n%10;    
		sum=(int) (sum+Math.pow(m,3));    
		n=n/10;
	}
		
		if(temp==sum)
		{
			System.out.println("it is armstrong number");
		}
		else
		{
			System.out.println("it is not armstrong number");	
		}	

	}

}
