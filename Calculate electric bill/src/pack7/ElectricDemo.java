package pack7;

import java.util.Scanner;

public class ElectricDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		ElectricBill e = new ElectricBill( );
		System.out.println("Enter the customer Name=");
		e.setCName(s.next( ));
		System.out.println("Enter the previous reading=");
		e.setCNumber(s.nextInt( ));
		System.out.println("Enter the previous reading=");
		e.setPReading(s.nextInt( ));
		System.out.println("Enter the current reading=");
		e.setCReading(s.nextInt( ));
		System.out.println(e);

	}

}
