package An;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		Product p=new Product();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the customer id:");
		p.setN(s.nextLine());
		System.out.println("Enter the customer name:");
		p.setC(s.nextLine());
		System.out.println("Enter the Quantity:");
		p.setP(s.nextInt());
		System.out.println("Enter the Price:");
		p.setL(s.nextInt());
		
		
		System.out.println(p);
		

	}

}
