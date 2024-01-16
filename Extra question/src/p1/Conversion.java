package p1;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		double kg;
		double pounds;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the weight in kilograms:");
		kg=s.nextDouble();
		pounds=kg*2.2046;
		System.out.println(+pounds +" Pounds");

	}

}
