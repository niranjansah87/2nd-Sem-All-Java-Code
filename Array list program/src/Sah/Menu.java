package Sah;

import java.util.Scanner;

public class Menu {
	public static MyMailList m[];
	private static int i=0;
	private static Scanner s=new Scanner(System.in);
	public static void initialize(int n)
	{
		m=new MyMailList[n];
	}
	public static int Menuselection()
	{
		System.out.println("<<<<<<<<<<<<<<<<<Menu>>>>>>>>>>>>>>>>>>>");
		System.out.println("1.Add new mail");
		System.out.println("2.Display all data");
		System.out.println("3.Exit");
		System.out.println("Enter the choice:");
		return s.nextInt();
	}
	public static void AddnewMail()
	{
		System.out.println("Enter the detail to add:Name and Mail ID");
		MyMailList temp=new MyMailList(s.next(),s.next());
		System.out.println("Data is added ");
		m[i++]=temp;
	}
	public static void DisplayAll()
	{
		System.out.println("<<<<<<<<<<<All Detail>>>>>>>>>>>");
		for(i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
	}
	
	

	public static void main(String[] args) {
		int ch;
		initialize(5);
		while(true)
		{
			ch=Menuselection();
			switch(ch)
			{
			case 1:
				AddnewMail();
				break;
			case 2:
				DisplayAll();
				break;
			case 3:
				System.exit(0);
			}
		}
		

	}

}
