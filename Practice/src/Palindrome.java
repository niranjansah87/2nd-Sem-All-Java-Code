import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n,i,sum=0,temp,r;
		Scanner P=new Scanner(System.in);
		System.out.println("Enter the number=");
		n=P.nextInt();
		temp=n;    
		while(n>0)    
		{    
		r=n%10;    
		sum=(sum*10)+r;    
		n=n/10;    
		}    
		if(temp==sum)    
		System.out.println("It is palindrome");    
		else    
		System.out.println("it is not palindrome"); 

	}

}
