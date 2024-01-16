import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		int n,i,sum=0,m,A;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the value of n=");
		n=S.nextInt();
		
		while(n>0)
		{
		m=n%10;    
		sum=sum+m;    
		n=n/10;
		}
		System.out.println("Sum="+sum);

	}

}

