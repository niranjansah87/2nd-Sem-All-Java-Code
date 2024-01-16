package Niranjan;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the base and height=");
		
		SC   obj = new   SC(s.nextInt(), s.nextInt());
		System.out.println(obj);
		


	}

}
