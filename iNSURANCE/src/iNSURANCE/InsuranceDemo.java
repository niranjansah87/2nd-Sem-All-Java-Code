package iNSURANCE;

import java.util.Scanner;

public class InsuranceDemo {

	public static void main(String[] args) {
		InsuranceCom I=new InsuranceCom();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the customer ID=");
		I.setA(s.next());
		System.out.println("Enter the customer Name=");
		I.setB(s.next());
		System.out.println("Enter the premium ammount=");
		I.setC(s.nextInt());
		System.out.println("Enter the no of installments=");
		I.setD(s.nextInt());
		System.out.println(I);
		
		
		

	}

}
