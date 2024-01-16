import java.util.Scanner;

public class CalculateVolume {
	static double len,bre,hei;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length=");
		len=s.nextDouble();
		System.out.println("Enter the length=");
		bre=s.nextDouble();
		System.out.println("Enter the length=");
		hei=s.nextDouble();
		double volume=len*bre*hei;
		System.out.println("Volume of cuboid is "+volume);
		
		
		

	}

}
