package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CuboidDemo {
	public static Scanner s;
	public static ArrayList<Cuboid>cu;
	public static void initialise(int n)
	{
		s=new Scanner(System.in);
		cu=new ArrayList<Cuboid>();
	}
	public static int menuOption()
	{
		System.out.println("<<<<<<Menu>>>>>>>>");
		System.out.println("1.Add new Cuboid");
		System.out.println("2.Display all");
		System.out.println("3.Sort by length");
		System.out.println("4.Sort by Area");
		System.out.println("5.Exit");
		System.out.println("Enter the choice");
		return s.nextInt();
	}

	public static void main(String[] args) {
		int ch;
		initialise(3);
		
		
		
		while(true)
		{
			ch=menuOption();
			switch(ch)
			{
			case 1:
				cu.add(addCuboid());
				break;
				
			case 2:
				System.out.println("==============All cuboid detail=============");
				for(Cuboid c:cu)
				{
					System.out.println(c);
				}
				break;
			case 3:
				//SortByLength();
				System.out.println("============Sorting by Length===============");
				Collections.sort(cu,new SortByLength());
				for(Cuboid cl:cu)
				{
					System.out.println(cl);
				}
				break;
			case 4:
				//SortByArea();
				System.out.println("================Sorting by Area==============");
				Collections.sort(cu,new SortByArea()); 
				for(Cuboid cb:cu)
				{
					System.out.println(cb);
				}
				break;
			case 5:
				System.exit(0);
			}
		}
		

	}
	/*private static void SortByArea() {
		SortByArea SBA=new SortByArea();
		
	}
	private static void SortByLength() {
		SortByLength SBL=new SortByLength();
		
	}*/
	private static Cuboid addCuboid() {
		System.out.println("Enter the length,breadth,height:");
		return new Cuboid(s.nextInt(),s.nextInt(),s.nextInt());
	}

}
