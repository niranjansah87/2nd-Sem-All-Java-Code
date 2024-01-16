import java.util.Scanner;

public class Cuboid extends Cube{
	static int b;
	static int h;
	public void findVolume()
	{
		super.findVolume();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length");
		l=s.nextInt();
		System.out.println("Enter the Breadth");
		b=s.nextInt();
		System.out.println("Enter the Height");
		h=s.nextInt();
		int vol=l*b*h;
		System.out.println("Volume of cuboid is "+vol);
	}

}
