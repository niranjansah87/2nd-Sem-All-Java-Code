import java.util.Scanner;

public class HypoDemo {

	public static void main(String[] args) {
		Hypo h=new Hypo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Side A:");
		 h.setA(sc.nextDouble());
		 System.out.println("Enter the Side B:");
		 h.setB(sc.nextDouble());
		 System.out.println(h);

	}

}
