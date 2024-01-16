package level;
import java.util.Scanner;
 public class CabDemo {
	public static void main(String args[]) {
		CabApp c =new CabApp();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name:");
		 c.setA(s.next());
		 System.out.println("Enter the phone number:");
		 c.setB(s.nextInt());
		 System.out.println("Enter the distance:");
		 c.setC(s.nextDouble());
		 System.out.println(c);
	}
}
