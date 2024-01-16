package p1;

import java.util.Scanner;


public class Volume {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length,breadth and height=");
		Cuboid obj = new   Cuboid(s.nextDouble(),s.nextDouble(),s.nextDouble());
		System.out.println(obj);
		System.out.println("---------------------------------------------------------");
		System.out.println("Enter the length,breadth and height=");
		Cuboid obj1= new   Cuboid(s.nextDouble(),s.nextDouble(),s.nextDouble());
		System.out.println(obj1);

	}

}
