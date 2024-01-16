import java.util.Scanner;

public class GeometricDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		GeometricShape g=new GeometricShape(s.next(),s.hasNext());
		Rectangle r=new Rectangle(s.nextInt(),s.nextInt(),s.nextInt());
		
		System.out.print(r.borderColor);
		System.out.print(" "+ r.filled);
		System.out.print(" "+r);
		

	}

}
