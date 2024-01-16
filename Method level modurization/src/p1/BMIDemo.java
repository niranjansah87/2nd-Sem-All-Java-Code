package p1;

import java.util.Scanner;

public class BMIDemo {

	public static void main(String[] args) {
		BMI b=new BMI();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name:");
		b.setName(s.next());
		System.out.println("Enter the Weight:");
		b.setW(s.nextInt());
		System.out.println("Enter the height:");
		b.setH(s.nextInt());
		System.out.println(b);

	}

}
