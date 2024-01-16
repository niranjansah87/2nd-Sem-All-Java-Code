package p1;

import java.util.Scanner;

public class Book {
     long ISBN;
     String Title;
     double price;
     int year;
     Book(long I,String T,double p,int y)
     {
    	 ISBN=I;
    	 Title=T;
    	 price=p;
    	 year=y;
     }
     public String toString()
 	{
 String str = String.format("ISBN Number=%d%nTitle=%s%nPricet=%s%nyear=%s%n",ISBN,Title,price,year);
 		return str;
 	}
     public static void main(String[] args) {
 		Scanner s=new Scanner(System.in);
 		System.out.println("Enter the ISBN,Title,Price and year=");
 		Book obj = new   Book(s.nextLong(),s.next(),s.nextDouble(),s.nextInt());
 		System.out.println("---------------------------------------------------------");
 		System.out.println(obj);
 		System.out.println("---------------------------------------------------------");
 		

 	}
}
