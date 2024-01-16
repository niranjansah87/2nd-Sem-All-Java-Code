package p1;

import java.util.Scanner;

public class Weight {
	private static float BMI;
	public static void BMI(double d,float height)
	{
		BMI=(float) (d/Math.pow(height,2));
	}
	public static void output()
	{
		System.out.println("BMI  is "+BMI);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Weight and Height=");
		Weight.BMI(s.nextDouble(),s.nextFloat());
		Weight.output();

	}

}
