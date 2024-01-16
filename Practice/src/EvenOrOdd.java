import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number=");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("It is even" );
		}
		else
		{
			System.out.println( "It is odd" );
		}
		

	}

}
