import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		int x,y;
		Scanner qd= new Scanner(System.in);
		System.out.println("Enter x ");
		x=qd.nextInt();
		System.out.println("Enter y");
		y=qd.nextInt();
		if(x>0 && y>0)
		{
			System.out.println("It is in First Quadrant");
		}
		else if(x>0 && y<0)
		{
			System.out.println("It is in Fourth Quadrant");
		}
		else if(x<0 && y>0)
		{
			System.out.println("It is in Second Quadrant");
		}
		else if(x<0 && y<0)
		{
			System.out.println("It is in Third Quadrant");
		}
		else
		{
			System.out.println("It is origin");
		}

	}

}
