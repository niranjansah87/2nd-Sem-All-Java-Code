package q2s;

import java.util.Scanner;

public class Demo {
	public static Scanner s=new Scanner(System.in);
public static void main(String args[]) {
	 int i;
	  System.out.println("Select Any One: ");
 Scanner r=new  Scanner (System.in);
	  System.out.println("1.teachingStaff ");
	  System.out.println("2.nonteachingStaff");
	  int ch=r.nextInt();
	  switch(ch){
	  case 1: 
		   System.out.println("Enter the number of teachingStaff: ");
		   int n=r.nextInt();
		   teachingStaff[] l=new teachingStaff[n];
		   for(i=0;i<n;i++){
			   System.out.println("Enter the ID,Name,basic,allowance");
		    l[i]=new teachingStaff(s.nextInt(),s.next(),s.nextInt(),s.nextInt());
		     }
		   for(i=0;i<n;i++){
		    l[i].display();
		   }
		   break;
	  case 2:
		   System.out.println("Enter the number of nonteachingStaff: ");
		   int m= r.nextInt();
		   nonteachingStaff [] h=new nonteachingStaff[m];
		   for(i=0;i<m;i++){
			   System.out.println("Enter the ID,Name,hour,wage");
		     h[i]=new nonteachingStaff(s.nextInt(),s.next(),s.nextInt(),s.nextInt());
		     }
		   for(i=0;i<m;i++){
		    h[i].display();
		   }
		   break;
		    
		   } 
	  }

}