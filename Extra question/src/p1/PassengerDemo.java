package p1;

import java.util.Scanner;


public class PassengerDemo {

	public static void main(String[] args) {
		Customer c =new Customer();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name:");
		 c.setA(s.nextLine());
		 System.out.println("Enter the phone number:");
		 c.setB(s.nextLong());
		 System.out.println("Enter the distance:");
		 c.setC(s.nextInt());
		 System.out.println(c);

	}

}
