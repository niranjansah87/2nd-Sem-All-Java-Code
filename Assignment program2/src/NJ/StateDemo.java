package NJ;

import java.util.Scanner;

public class StateDemo {

	public static void main(String[] args) {
		State s=new State();
		Scanner sc=new Scanner(System.in);
		String name[]=new String[5];
		String Capital[]=new String[5];
		long Population[]=new long[5];
		int Literacy[]=new int[5];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the name");
			name[i]=sc.nextLine();
			System.out.println("Enter the Capital");
			Capital[i]=sc.next();
			System.out.println("Enter the Population");
			Population[i]=sc.nextLong();
			System.out.println("Enter the Literacy");
			Literacy[i]=sc.nextInt();
		 
			
		}
		for(int i=0;i<2;i++)
		{
			System.out.println(s.getN());
			
		}

	}

}
