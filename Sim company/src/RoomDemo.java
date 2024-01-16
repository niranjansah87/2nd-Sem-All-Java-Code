import java.util.Scanner;

public class RoomDemo {

	public static void main(String[] args) {
		Room r=new Room();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the ISBN Number=");
		r.setA(s.nextLong());
		System.out.println("Enter the Title=");
		r.setB(s.next());
		System.out.println("Enter the Price=");
		r.setC(s.nextDouble());
		System.out.println(r);

	}

}
