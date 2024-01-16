package Niranjan;

import java.util.Scanner;

public class Shape {
	static double rad;
	public void findArea()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius:");
		 rad=s.nextDouble();
		double ar=rad*rad;
		System.out.println("Area of Shape is "+ar);
	}
}
