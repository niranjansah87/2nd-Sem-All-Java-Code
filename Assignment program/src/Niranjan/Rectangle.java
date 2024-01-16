package Niranjan;

import java.util.Scanner;

public class Rectangle extends Shape{
	static double h;
	public void findArea()
	{
		super.findArea();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius:");
		 rad=s.nextDouble();
		 System.out.println("Enter the height");
		 h=s.nextDouble();
		
		double ar=3.14*rad*rad*h;
		System.out.println("Area= "+ar);
	}
}
