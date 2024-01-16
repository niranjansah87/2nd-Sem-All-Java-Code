import java.util.Scanner;

public class SearchBall {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the position of ball=");
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("Color of ball is white");
		}
		else
		{
			System.out.println("Color of ball is black");
		}
		

	}

}
