import java.util.Scanner;

public class Cube {
	static int l;
	public void findVolume()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length");
		l=s.nextInt();
		int volume=l*l*l;
		System.out.println("Volume of Cube is "+volume);
	}
	

}
