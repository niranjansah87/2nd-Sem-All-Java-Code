import java.util.Scanner;
  
public class Geometry {
	static double x1;
 	static double x2;
 	static double y1;
 	static double y2;
 	
	public static void main(String[] args) {	 
			        
			         for(int i=0;i<args.length;i++)
			         {
			        	 x1=Double.parseDouble(args[0]);
				         x2=Double.parseDouble(args[1]);
				         y1=Double.parseDouble(args[2]);
				         y2=Double.parseDouble(args[3]);
			         }
			         double dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); 	 	    	 	    
			         System.out.println("distance between two point is "+dis);
			         
			        
		                   	    
				 
			}
}
