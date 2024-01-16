package Niranjan;
import java.util.Scanner;
public class BMI 
{
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		 String Name[]=new String[2];
		 int Weight[]=new int[2];
		 int Height[]=new int[2];
		 int BMI1[] = new int[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the name");
			Name[i]=s.next();
			System.out.println("Enter the weight");
			Weight[i]=s.nextInt();
			System.out.println("Enter the height");
			Height[i]=s.nextInt();
		  BMI1[i]= Weight[i]/(Height[i]*Height[i]);
			
		}
		for(int i=0;i<2;i++)
		{
			System.out.println("Name="+Name[i]);
			System.out.println("Weight="+Weight[i]);
			System.out.println("Height="+Height[i]);
			System.out.println("BMI="+BMI1[i]);
		}
		
		
		

	}

}
