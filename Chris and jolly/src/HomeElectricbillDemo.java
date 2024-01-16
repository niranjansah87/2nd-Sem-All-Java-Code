import java.util.Scanner;

public class HomeElectricbillDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		HomeElectricbill e = new HomeElectricbill( );
		System.out.println("Enter the customer Name=");
		e.setCName(s.next( ));
		System.out.println("Enter the customer Id=");
		e.setCNumber(s.nextInt( ));
		System.out.println("Enter the unit consumed=");
		e.setUnit(s.nextInt());
		System.out.println(e);

	}

}
