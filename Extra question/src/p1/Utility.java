package p1;

import java.util.Scanner;

public class Utility {
	static int a;
	static int b;
	static int c;
	static int d;
	static int e;
	static int arr[]=new int[10];
	 public static int add()
	 {
		 
		 int add=a+b;
		return add;
	 }
	 public static int Add()
	 {
		 int add=c+d+e;
		return add;
	 }
	 public static int  AddArray()
	 {
		 int sum=0;
		 
		 for(int i=0;i<10;i++)
		 {
			 sum=sum+arr[i];
		 }
		 
		 
		return sum;
	 }
	 public String toString()
	 {
		 String s=String.format("A=%d%n B=%d%n C=%d%n D=%d%n E=%d%n Addition of first method=%d%n Addition of second method= %d%n Addition of array=%d%n",a,b,c,d,e,add(),Add(),AddArray());
		 return s;
	 }
	 

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Utility u=new Utility();
		 System.out.println("Enter the value of a:");
		 a=s.nextInt();
		 System.out.println("Enter the value of b:");
		 b=s.nextInt();
		 System.out.println("Enter the value of c:");
		 c=s.nextInt();
		 System.out.println("Enter the value of d:");
		 d=s.nextInt();
		 System.out.println("Enter the value of e:");
		 e=s.nextInt();
		 System.out.println("Enter the size of array=");
		 int n=s.nextInt();
		 System.out.println("Enter the"+n+" elements of array=");
		 
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=s.nextInt();
		 }
		 System.out.println("----------------------------------------------------");
		 System.out.println(u);
		 System.out.println("----------------------------------------------------");

	}

}
