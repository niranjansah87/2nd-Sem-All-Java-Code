package cu;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Cuboid c=new Cuboid();
		System.out.println("Enter the length");
		c.setL(s.nextDouble());
		System.out.println("Enter the breadth");
		c.setB(s.nextDouble());
		System.out.println("Enter the height");
		c.setH(s.nextDouble());
		System.out.println(c);
	}

}
