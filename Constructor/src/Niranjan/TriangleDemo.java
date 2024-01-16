package Niranjan;

import java.util.Scanner;

public class TriangleDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the base=");
		System.out.println("Enter the height=");
		Triangle area = new Triangle(s.nextDouble(), s.nextDouble());
		System.out.println(area);
		
		
		
	}

}
