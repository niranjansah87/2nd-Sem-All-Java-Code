import java.io.*;
import java.util.Scanner;

public class Star{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of star to print=");
		n=s.nextInt();
		int a, b;
		for (a = 0; a < n; a++) {
			for (b = 0; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	}

