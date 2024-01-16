import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,fact=1,i;
		Scanner f= new Scanner(System.in);
		System.out.println("Enter the number=");
		n=f.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is "+fact);

	}

}
