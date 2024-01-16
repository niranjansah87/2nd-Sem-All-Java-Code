package p2;
import java.util.Scanner;

import p1.Date;
public class DateDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter date,month and year=");
		//Date nir=new Date(1,02,2003);
		Date nir=new Date(s.nextInt(),s.nextInt(),s.nextInt());
		System.out.println(nir);
		

	}

}
