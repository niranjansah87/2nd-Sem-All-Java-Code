package N;

import java.util.Scanner;
  
public class Geometry {
	static double x1;
 	static double x2;
 	static double y1;
 	static double y2;
	public static void main(String[] args) {	 
			         double dis;
			         Scanner sc=new Scanner(System.in);
			         System.out.println("Enter x1 ");
		                 x1=sc.nextDouble();
		                 System.out.println("enter y1");	   
		                 y1=sc.nextDouble(); 
			         System.out.println("enter x2");	   
		                 x2=sc.nextDouble();
			         System.out.println("enter y2");	   
		                 y2=sc.nextInt();	  	    
				 dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); 	 	    	 	    
		  	         System.out.println("distance between two point is "+dis);
			}
}
