package p117;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class CountryDemo implements Comparable<Country>{
	public static Scanner s;
	public static Vector<Country>co;
	public static void initialise(int n)
	{
		co=new Vector<Country>();
		s=new Scanner(System.in);
		
	}
	public static int menuOption()
	{
		//System.out.println("===============================Menu==========================");
		//System.out.println("1.Add Country Name");
		System.out.println("2.Search for Country Name");
		System.out.println("3.Sort the name");
		System.out.println("4.Exit");
		System.out.println("Enter the choice:");
		
		return s.nextInt();
	}
	public static void main(String[] args) {
		int ch;
		initialise(4);
		while(true)
		{
			ch=menuOption();
			switch(ch)
			{
			//case 1:
				co.add(addCountry());
				break;
			case 2:
				searchCountry();
				break;
			case 3:
				System.out.println("Sorted List");
				sortByCountry();
				
			case 4:
				System.exit(0);
				
			}
		}
		

	}
	private static void sortByCountry() {
		Collections.sort(co);
		for(Country c:co)
		{
			System.out.println(c);
		}
		
	}
	private static void searchCountry() {
		System.out.println("Enter the name to search:");
		String search=s.next();
		for(Country cou:co)
		{
			if(cou.getName()==search)
			{
				System.out.println("Country found");
				//System.out.println(cou);
			}
		}
		
	}
	private static Country addCountry() {
		System.out.println("Enter the country name:");
		//System.out.println("Name added");
		return new Country(s.next());
		
	}
	public int compareTo(Country o) {
		if()
		
	}
	

}
