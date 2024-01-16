package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Utility{
	public static ArrayList<Integer> s1=new ArrayList<Integer>();
	public static ArrayList<Integer> s2=new ArrayList<Integer>();
	public static Scanner s=new Scanner(System.in);
	public static int MenuSelect()
	{
		System.out.println("1.Search the element in s1");
		System.out.println("2.Store the element from s1 to s2");
		System.out.println("3.Find the smallest element in s2");
		System.out.println("4.Exit");
		return s.nextInt();
	}

	
	public static void main(String[] args) {
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s2.add(60);
		s2.add(70);
		s2.add(80);
		s2.add(90);
		int ch;
		
		while(true)
		{
			ch=MenuSelect();
			switch(ch)
			{
			case 1:
				SearchElementS1();
				break;
			case 2:
				StoreS1toS2();
				break;
			case 3:
				FindSmallestinS2();
				break;
			}
		}

	}
		
		
		
	public static void FindSmallestinS2() {
		int smallest= s1.get(0);
		for (int x : s2){
			if (x < smallest) {
			      smallest = x;
			   }
		}
		System.out.println(smallest);
		
	}
	public static void StoreS1toS2() {
		Collections.copy(s1,s2); // copying the ArrayList  to the ArrayList list
	      System.out.println(s2);
		
	}
	public static void SearchElementS1() {
		System.out.println("Enter the elements to search:");
		int search=s.nextInt();
		for (Integer element : s1){
		
			if(Integer.valueOf(0)==search)
			{
				System.out.println("Element found");
				System.out.println(element);
			}
		}
		
	}

}
