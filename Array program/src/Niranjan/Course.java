package Niranjan;

import java.util.Scanner;

public class Course {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		 String Name[]=new String[10];
		 String CourseTitle[]=new String[10];
		 String Coursecode[]=new String[10];
		 int CourseCredit[] = new int[10];
		 System.out.println("Enter the number of student=");
		 int n=c.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name");
			Name[i]=c.next();
			System.out.println("Enter the Course Title");
			CourseTitle[i]=c.next();
			System.out.println("Enter the Course code");
			Coursecode[i]=c.next();
			System.out.println("Enter the Course credit");
			CourseCredit[i]=c.nextInt();
		  
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("------------Student Detail---------------");
			System.out.println("-   Name=                               -"+Name[i]);
			System.out.println("-   Course Title=                       -"+CourseTitle[i]);
			System.out.println("-   Course Code=                        -"+Coursecode[i]);
			System.out.println("-   Course Credit=                      -"+CourseCredit[i]      );
			System.out.println("-----------------------------------------\n\n");
		}
		
		
		

	}

	}


