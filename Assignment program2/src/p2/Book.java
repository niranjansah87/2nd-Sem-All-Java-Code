package p2;

import java.util.Scanner;

public class Book {
	
		private long ISBN;
		private String Title;
		private double Price;
		private int year;
		Book(long i,String T,double P,int y)
		{
			ISBN=i;
			Title=T;
			Price=P;
			year=y;
		}
		
		
		public String toString()
		{
			String str=String.format("ISBN Number=%d%n Title=%s%n Price=%s%n year=%d%n",ISBN,Title,Price,year);
			return str;
		}
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the ISBN Number,Title,Price,Year=");
			Book r=new Book(s.nextLong(),s.next(),s.nextDouble(),s.nextInt() );
			System.out.println(r);
			
			
			

		}

		}



