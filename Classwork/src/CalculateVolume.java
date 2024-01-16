import java.util.Scanner;

public class CalculateVolume {

	public static void main(String[] args) {
		int l,b,h,volume;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the length=");
		l=s.nextInt();
		System.out.println("Enter the breadth=");
		b=s.nextInt();
		System.out.println("Enter the height=");
		h=s.nextInt();
		volume=l*b*h;
		System.out.println("Volume="+volume);

	}

}
