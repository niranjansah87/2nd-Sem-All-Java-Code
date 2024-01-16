package p1;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class MainMenu 
{
	public static Scanner sr=new Scanner(System.in);
	public static void main(String args[])
	{
		ArrayList<Cuboid> al=new ArrayList<Cuboid>();
		while(true)
		{
			System.out.println("\n***Main menu***");
			System.out.println("1)Add new Cuboid\n2)Display all\n3)Sort by Length\n4)Sort by Area\n5)Exit");
			System.out.println("Enter your choice");
			int cho=sr.nextInt();
			switch(cho)
			{
			case 1: 
				System.out.println("Enter the Length, Breadth and Height");
				Cuboid c= new Cuboid(sr.nextInt(),sr.nextInt(),sr.nextInt());
				al.add(c);
				System.out.println("Cuboid added");
				break;
			case 2: 
				for(int i=0 ;i < al.size();i++)
				System.out.println(al.get(i)); 
				break;
			case 3:
				System.out.println("Sorted by Length");
			    Collections.sort(al, new SortByLength());
				for(int i=0 ;i < al.size();i++)
					System.out.println(al.get(i));
				break;
			case 4: 
				System.out.println("Sorted by Area");
			    Collections.sort(al, new SortByArea());
				for(int i=0 ;i < al.size();i++)
					System.out.println(al.get(i));
				break;
				
			case 5: System.exit(0);
			default: System.out.println("Please enter 1 to 5");
			}
		}
	}

}
